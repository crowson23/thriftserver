package serverdemo.thriftserver;

import org.apache.commons.codec.binary.Base64;

import com.google.protobuf.InvalidProtocolBufferException;

import de.cache.DeliveryMessage.AllyesAds;

public class Test {

	public static void main(String[] args) throws InvalidProtocolBufferException {
		// TODO Auto-generated method stub

		String str = "ChVJRkNfZGV2ZWxvcF9hdXRvYnVpbGRKuwEI8QcQABgDIA8ogJqWlgUw/6GVtAU4AUABSANSDCCAlOvcAyiAlOvcA2oGCAAQAxgDeiMI604QgJqWlgUY/6GVtAUgACjwhgUwADABMAIwAzAEMAUwBoIBPMoBHQoNdGFyZ2V0L3AuMTAwORAAGgoxMDAvU1BfMDAxmgIZCg10YXJnZXQvdi4xMDA5EAAaBi8xMDAvMIgBAZABlgiQAdw2kAHZNpAB2DagAfEHqAEAsAGAreIEuAEAwAFk";

		// System.out.println(new String(Base64.decodeBase64(str)));

		System.out.println(AllyesAds.parseFrom(Base64.decodeBase64(str)));

	}

}
