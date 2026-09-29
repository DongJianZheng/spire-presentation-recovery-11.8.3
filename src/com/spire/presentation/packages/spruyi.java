/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprbho;
import java.io.IOException;
import java.security.KeyStore;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class spruyi {
    public static char[] cfr_renamed_9263(KeyStore.LoadStoreParameter arg0) throws IOException {
        KeyStore.ProtectionParameter protectionParameter = arg0.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection)protectionParameter).getPassword();
        }
        if (protectionParameter instanceof KeyStore.CallbackHandlerProtection) {
            CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection)protectionParameter).getCallbackHandler();
            PasswordCallback passwordCallback = new PasswordCallback(sprbho.cfr_renamed_9("3^0L4P1[y\u001f"), false);
            try {
                Callback[] callbackArray = new Callback[1];
                callbackArray[0] = passwordCallback;
                callbackHandler.handle(callbackArray);
                return passwordCallback.getPassword();
            }
            catch (UnsupportedCallbackException unsupportedCallbackException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprahe.cfr_renamed_9("\n>),-0(;\u0019>638>94z15+z-?<5846):>ez")).append(unsupportedCallbackException.getMessage()).toString(), unsupportedCallbackException);
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbho.cfr_renamed_9("-PcL6O3P1KcY,McO1P7Z K*P-\u001f3^1^.Z7Z1\u001f,YcK:O&\u001f")).append(protectionParameter.getClass().getName()).toString());
    }
}

