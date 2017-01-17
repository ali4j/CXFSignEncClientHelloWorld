package net.ali4j.service.util;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

/**
 * Created by ali4j on 1/5/2017.
 */
public class ClientPasswordCallback implements CallbackHandler {

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback : callbacks) {
            WSPasswordCallback pc = (WSPasswordCallback) callback;
            if (pc.getUsage() == WSPasswordCallback.SIGNATURE || pc.getUsage() == WSPasswordCallback.DECRYPT)
                if (pc.getIdentifier().equals("client"))
                    pc.setPassword("password");
        }


    }
}
