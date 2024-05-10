import org.junit.Test;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.utils.Convert;
import java.math.BigInteger;

/**
 * @author HMB-XS
 * @date 2024年05月10日17:19:15
 **/
public class GMPService {
	// 私钥
	private String key = "这里写你的私钥";
	// 节点RPC  建议自己去注册一个infura或者alchemy，默认的不好用
	private String rpc = "https://ethereum-sepolia.publicnode.com";
	// 链ID 不换项目，请勿更改
	private long id = 11155111;
	// 点击具体运行，或者直接运行表示运行所有测试代码


	@Test
	public void test() {
		// 钱包设置
		String gateway = "0xB5D83c2436Ad54046d57Cd48c00D619D702F3814";
		Web3j web3 = Web3j.build(new HttpService(rpc));
		Credentials credentials = Credentials.create(key);
		// 交易设置
		TransactionManager transactionManager = new RawTransactionManager(
				web3, credentials, id);
		System.out.println("部署合约开始执行:");
		// 执行次数
		for (int i = 0; i < 5; i++) {
			try {
				// 执行部署
				SolidityGMP solidityGMP = SolidityGMP.deploy(web3, transactionManager, new DefaultGasProvider(), gateway).sendAsync().get();
				System.out.println(solidityGMP.getContractAddress());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void test2() {
		// 初始化web3j客户端
		Web3j web3 = Web3j.build(new HttpService(rpc));
		// 使用钱包文件和密码加载凭证对象
		Credentials credentials = Credentials.create(key);
		// 填入目标地址 给自己发送
		String toAddress = "0xB5D83c2436Ad54046d57Cd48c00D619D702F3814";
		// 交易金额
		BigInteger amountInWei = Convert.toWei("0", Convert.Unit.ETHER).toBigInteger();
		// data数据
		String data1 = "0xa7ef4ebd000000000000000000000000";
		String data2 = credentials.getAddress().substring(2);
		String data3 = "000000000000000000000000000000000000000000000000000000000000000700000000000000000000000000000000000000000000000000000000000186a000000000000000000000000000000000000000000000000000000000000000800000000000000000000000000000000000000000000000000000000000000000";
		String data = data1 + data2 + data3;
		System.out.println("发送消息开始执行:");
		// 执行次数
		for (int i = 0; i < 5; i++) {
			// 获取当前网络的建议费用
			try {
				BigInteger maxPriorityFeePerGas = web3.ethGasPrice().send().getGasPrice();
				// 为了提高成功打包的可能性，可以在建议费用的基础上稍微提高一点
				// 在建议费用的基础上增加1 Gwei
				BigInteger maxFeePerGas = maxPriorityFeePerGas.add(BigInteger.valueOf(1000000000));
				// 构建交易对象
				EthSendTransaction ethSendTransaction = new RawTransactionManager(
						web3, credentials)
						.sendEIP1559Transaction(
								id,
								maxPriorityFeePerGas, // 优先级
								maxFeePerGas, // 最大费用
								DefaultGasProvider.GAS_LIMIT,
								toAddress,
								data,
								amountInWei
						);
				String transactionHash = ethSendTransaction.getTransactionHash();
				// 交易哈希
				System.out.println(transactionHash);
				Thread.sleep(1000); // 1000 毫秒 = 1 秒
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
