/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjj;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprllk;
import com.spire.presentation.packages.sprlzk;
import com.spire.presentation.packages.sproai;
import com.spire.presentation.packages.sproxk;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprral;
import com.spire.presentation.packages.sprrbia;
import com.spire.presentation.packages.sprrgi;
import com.spire.presentation.packages.sprrnj;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprtwk;
import com.spire.presentation.packages.sprvmk;
import com.spire.presentation.packages.sprwpj;
import com.spire.presentation.packages.sprwvh;
import com.spire.presentation.packages.sprxkj;
import com.spire.presentation.packages.sprxsk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprywe;
import com.spire.presentation.packages.spryyk;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGeneratorSpi;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;

public class sprupj
extends KeyPairGeneratorSpi {
    private static final int cfr_renamed_86 = 4;
    private int cfr_renamed_152;
    private static final int cfr_renamed_112 = -1;
    private SecureRandom cfr_renamed_119;
    private static final int cfr_renamed_91 = 1;
    private static final int cfr_renamed_0 = -2;
    private final int cfr_renamed_1;
    private static final int cfr_renamed_2 = 3;
    private static final int cfr_renamed_3 = 2;
    private sprii cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprupj sprupj2 = this;
        sprupj2.cfr_renamed_152 = this.cfr_renamed_9420((int)arg0);
        sprupj2.cfr_renamed_119 = secureRandom;
        sprupj2.cfr_renamed_4 = null;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (this.cfr_renamed_152 == 0) {
            throw new IllegalStateException(sprrbia.cfr_renamed_9("\u000b\u0001\u0002\u0001\u001e\u0005\u0018\u000b\u001eD\u0002\u000b\u0018D\u000f\u000b\u001e\u0016\t\u0007\u0018\b\u0015D\u0005\n\u0005\u0010\u0005\u0005\u0000\r\u0016\u0001\b"));
        }
        if (null == this.cfr_renamed_4) {
            this.cfr_renamed_4 = this.cfr_renamed_9421();
        }
        sprupj sprupj2 = this;
        sprsil sprsil2 = sprupj2.cfr_renamed_4.cfr_renamed_1223();
        switch (sprupj2.cfr_renamed_152) {
            case 1: 
            case 2: {
                return new KeyPair(new sprxkj(sprsil2.cfr_renamed_1224()), new sprcjj(sprsil2.cfr_renamed_1225()));
            }
            case 3: 
            case 4: {
                return new KeyPair(new sprwpj(sprsil2.cfr_renamed_1224()), new sprrnj(sprsil2.cfr_renamed_1225()));
            }
        }
        throw new IllegalStateException(sprywe.cfr_renamed_9("4<=<!8'6!y=6'y06!+6:'5*y:7:-:8?0)<7"));
    }

    private static /* synthetic */ int cfr_renamed_9422(String arg0) throws InvalidAlgorithmParameterException {
        if (arg0.equalsIgnoreCase("X25519") || arg0.equals(sprtu.cfr_renamed_3.cfr_renamed_19())) {
            return 3;
        }
        if (arg0.equalsIgnoreCase("Ed25519") || arg0.equals(sprtu.cfr_renamed_0.cfr_renamed_19())) {
            return 1;
        }
        if (arg0.equalsIgnoreCase("X448") || arg0.equals(sprtu.cfr_renamed_4.cfr_renamed_19())) {
            return 4;
        }
        if (arg0.equalsIgnoreCase("Ed448") || arg0.equals(sprtu.cfr_renamed_2.cfr_renamed_19())) {
            return 2;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprrbia.cfr_renamed_9("\r\u0002\u0012\r\b\u0005\u0000L\u0014\r\u0016\r\t\t\u0010\t\u0016?\u0014\t\u0007L\n\r\t\t^L")).append(arg0).toString());
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprupj.cfr_renamed_5681(arg0);
        if (null == string) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprywe.cfr_renamed_9(":7%8?07y#8!8><'<!\n#<0cs")).append(arg0).toString());
        }
        int n = sprupj.cfr_renamed_9422(string);
        if (this.cfr_renamed_1 != n && this.cfr_renamed_1 != sprupj.cfr_renamed_9423(n)) {
            throw new InvalidAlgorithmParameterException(sprrbia.cfr_renamed_9("\u0014\r\u0016\r\t\t\u0010\t\u0016?\u0014\t\u0007L\u0002\u0003\u0016L\u0013\u001e\u000b\u0002\u0003L\u0007\u0019\u0016\u001a\u0001L\u0010\u0015\u0014\t"));
        }
        sprupj sprupj2 = this;
        sprupj2.cfr_renamed_152 = n;
        sprupj2.cfr_renamed_119 = arg1;
        this.cfr_renamed_4 = null;
    }

    private /* synthetic */ sprii cfr_renamed_9421() {
        if (null == this.cfr_renamed_119) {
            this.cfr_renamed_119 = sprybl.cfr_renamed_2794();
        }
        switch (this.cfr_renamed_152) {
            case 1: {
                sprral sprral2;
                sprral sprral3 = sprral2 = new sprral();
                sprral3.cfr_renamed_5536(new sproxk(this.cfr_renamed_119));
                return sprral3;
            }
            case 2: {
                sprxsk sprxsk2 = new sprxsk();
                sprxsk2.cfr_renamed_5536(new sprtwk(this.cfr_renamed_119));
                return sprxsk2;
            }
            case 3: {
                sprlzk sprlzk2 = new sprlzk();
                sprlzk2.cfr_renamed_5536(new sprvmk(this.cfr_renamed_119));
                return sprlzk2;
            }
            case 4: {
                spryyk spryyk2 = new spryyk();
                spryyk2.cfr_renamed_5536(new sprllk(this.cfr_renamed_119));
                return spryyk2;
            }
        }
        throw new IllegalStateException(sprywe.cfr_renamed_9("4<=<!8'6!y=6'y06!+6:'5*y:7:-:8?0)<7"));
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof ECGenParameterSpec) {
            return ((ECGenParameterSpec)arg0).getName();
        }
        if (arg0 instanceof sprwvh) {
            return ((sprwvh)arg0).cfr_renamed_313();
        }
        if (arg0 instanceof sproai) {
            return ((sproai)arg0).cfr_renamed_9198();
        }
        if (arg0 instanceof sprrgi) {
            return ((sprrgi)arg0).cfr_renamed_9198();
        }
        return sprqpj.cfr_renamed_5672(arg0);
    }

    public sprupj(int arg0) {
        this.cfr_renamed_1 = arg0;
        if (sprupj.cfr_renamed_9423(this.cfr_renamed_1) != arg0) {
            this.cfr_renamed_152 = arg0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_9423(int arg0) {
        switch (arg0) {
            case 1: 
            case 2: {
                return -1;
            }
            case 3: 
            case 4: {
                return -2;
            }
        }
        return arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_9420(int arg0) {
        switch (arg0) {
            case 255: 
            case 256: {
                switch (this.cfr_renamed_1) {
                    case -1: 
                    case 1: {
                        return 1;
                    }
                    case -2: 
                    case 3: {
                        return 3;
                    }
                }
                throw new InvalidParameterException(sprrbia.cfr_renamed_9("\u0007\u0001\u0015D\u001f\r\u0016\u0001L\n\u0003\u0010L\u0007\u0003\n\n\r\u000b\u0011\u001e\u0005\u000e\b\t"));
            }
            case 448: {
                switch (this.cfr_renamed_1) {
                    case -1: 
                    case 2: {
                        return 2;
                    }
                    case -2: 
                    case 4: {
                        return 4;
                    }
                }
                throw new InvalidParameterException(sprywe.cfr_renamed_9("8<*y 0)<s7<-s:<7504,!8156"));
            }
        }
        throw new InvalidParameterException(sprrbia.cfr_renamed_9("\u0011\u0002\u000f\u0002\u000b\u001b\nL\u000f\t\u001dL\u0017\u0005\u001e\t"));
    }
}

