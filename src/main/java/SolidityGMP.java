import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.7.
 */
@SuppressWarnings("rawtypes")
public class SolidityGMP extends Contract {
    public static final String BINARY = "60a060405234801561000f575f80fd5b5060405161052a38038061052a833981810160405281019061003191906100c9565b8073ffffffffffffffffffffffffffffffffffffffff1660808173ffffffffffffffffffffffffffffffffffffffff1681525050506100f4565b5f80fd5b5f73ffffffffffffffffffffffffffffffffffffffff82169050919050565b5f6100988261006f565b9050919050565b6100a88161008e565b81146100b2575f80fd5b50565b5f815190506100c38161009f565b92915050565b5f602082840312156100de576100dd61006b565b5b5f6100eb848285016100b5565b91505092915050565b60805161041f61010b5f395f6089015261041f5ff3fe608060405260043610610028575f3560e01c8063019009371461002c5780638381f58a1461005c575b5f80fd5b61004660048036038101906100419190610220565b610086565b60405161005391906102b3565b60405180910390f35b348015610067575f80fd5b5061007061013a565b60405161007d91906102e4565b60405180910390f35b5f7f000000000000000000000000000000000000000000000000000000000000000073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614610115576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161010c90610357565b60405180910390fd5b5f80815480929190610126906103a2565b91905055505f545f1b905095945050505050565b5f5481565b5f80fd5b5f80fd5b5f819050919050565b61015981610147565b8114610163575f80fd5b50565b5f8135905061017481610150565b92915050565b5f6fffffffffffffffffffffffffffffffff82169050919050565b61019e8161017a565b81146101a8575f80fd5b50565b5f813590506101b981610195565b92915050565b5f80fd5b5f80fd5b5f80fd5b5f8083601f8401126101e0576101df6101bf565b5b8235905067ffffffffffffffff8111156101fd576101fc6101c3565b5b602083019150836001820283011115610219576102186101c7565b5b9250929050565b5f805f805f608086880312156102395761023861013f565b5b5f61024688828901610166565b9550506020610257888289016101ab565b945050604061026888828901610166565b935050606086013567ffffffffffffffff81111561028957610288610143565b5b610295888289016101cb565b92509250509295509295909350565b6102ad81610147565b82525050565b5f6020820190506102c65f8301846102a4565b92915050565b5f819050919050565b6102de816102cc565b82525050565b5f6020820190506102f75f8301846102d5565b92915050565b5f82825260208201905092915050565b7f756e617574686f72697a656400000000000000000000000000000000000000005f82015250565b5f610341600c836102fd565b915061034c8261030d565b602082019050919050565b5f6020820190508181035f83015261036e81610335565b9050919050565b7f4e487b71000000000000000000000000000000000000000000000000000000005f52601160045260245ffd5b5f6103ac826102cc565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff82036103de576103dd610375565b5b60018201905091905056fea26469706673582212201679aa980766d4d10d440738d430fbd405a2c26c9214aab7c8aea44a0300aa3b64736f6c63430008190033";

    public static final String FUNC_NUMBER = "number";

    public static final String FUNC_ONGMPRECEIVED = "onGmpReceived";

    @Deprecated
    protected SolidityGMP(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected SolidityGMP(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected SolidityGMP(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected SolidityGMP(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> number() {
        final Function function = new Function(FUNC_NUMBER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> onGmpReceived(byte[] param0, BigInteger param1, byte[] param2, byte[] param3) {
        final Function function = new Function(
                FUNC_ONGMPRECEIVED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0), 
                new org.web3j.abi.datatypes.generated.Uint128(param1), 
                new org.web3j.abi.datatypes.generated.Bytes32(param2), 
                new org.web3j.abi.datatypes.DynamicBytes(param3)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static SolidityGMP load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SolidityGMP(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static SolidityGMP load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SolidityGMP(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static SolidityGMP load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new SolidityGMP(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static SolidityGMP load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new SolidityGMP(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<SolidityGMP> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String gateway) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, gateway)));
        return deployRemoteCall(SolidityGMP.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<SolidityGMP> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String gateway) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, gateway)));
        return deployRemoteCall(SolidityGMP.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<SolidityGMP> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String gateway) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, gateway)));
        return deployRemoteCall(SolidityGMP.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<SolidityGMP> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String gateway) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, gateway)));
        return deployRemoteCall(SolidityGMP.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
