/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakia;
import com.spire.presentation.packages.spraob;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdtd;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprnhc;
import com.spire.presentation.packages.sprnmd;
import com.spire.presentation.packages.sprpgd;
import com.spire.presentation.packages.sprqgc;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spryjd;
import com.spire.presentation.packages.sprzkd;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class sprznc
extends KeyPairGenerator {
    public spryjd cfr_renamed_91;
    public boolean cfr_renamed_0;
    public SecureRandom cfr_renamed_1;
    public int cfr_renamed_2;
    public int cfr_renamed_3;
    public sprnmd cfr_renamed_4;

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprznc sprznc2;
        if (!(arg0 instanceof spraob) && !(arg0 instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprakia.cfr_renamed_9("\u0019T\u001bT\u0004P\u001dP\u001b\u0015\u0006W\u0003P\nAI[\u0006AITIq!e\bG\bX\fA\fG:E\fVIZ\u001b\u0015\b[Ip\u0005r\bX\bY9T\u001bT\u0004P\u001dP\u001bf\u0019P\n"));
        }
        if (arg0 instanceof spraob) {
            spraob spraob2 = (spraob)arg0;
            sprznc2 = this;
            this.cfr_renamed_91 = new spryjd(arg1, new sprpgd(spraob2.cfr_renamed_1155(), spraob2.cfr_renamed_1145()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec)arg0;
            sprznc2 = this;
            this.cfr_renamed_91 = new spryjd(arg1, new sprpgd(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        sprznc2.cfr_renamed_4.cfr_renamed_1222(this.cfr_renamed_91);
        this.cfr_renamed_0 = true;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprznc sprznc2 = this;
        sprznc2.cfr_renamed_3 = arg0;
        sprznc2.cfr_renamed_1 = secureRandom;
    }

    public sprznc() {
        sprznc sprznc2 = this;
        super(sprdtd.cfr_renamed_9("ndliFiG"));
        sprznc sprznc3 = this;
        this.cfr_renamed_4 = new sprnmd();
        this.cfr_renamed_3 = 1024;
        sprznc2.cfr_renamed_2 = 20;
        sprznc2.cfr_renamed_1 = new SecureRandom();
        sprznc2.cfr_renamed_0 = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        Object object;
        Object object2;
        if (!this.cfr_renamed_0) {
            sprznc sprznc2;
            object2 = sprbrb.cfr_renamed_86.cfr_renamed_1454(this.cfr_renamed_3);
            if (object2 != null) {
                sprznc2 = this;
                this.cfr_renamed_91 = new spryjd(this.cfr_renamed_1, new sprpgd(((DHParameterSpec)object2).getP(), ((DHParameterSpec)object2).getG(), ((DHParameterSpec)object2).getL()));
            } else {
                object = new sprvnd();
                sprznc sprznc3 = this;
                sprznc2 = sprznc3;
                sprznc sprznc4 = this;
                ((sprvnd)object).cfr_renamed_2492(sprznc3.cfr_renamed_3, sprznc4.cfr_renamed_2, sprznc4.cfr_renamed_1);
                sprznc3.cfr_renamed_91 = new spryjd(this.cfr_renamed_1, ((sprvnd)object).cfr_renamed_2493());
            }
            sprznc2.cfr_renamed_4.cfr_renamed_1222(this.cfr_renamed_91);
            this.cfr_renamed_0 = true;
        }
        object2 = this.cfr_renamed_4.cfr_renamed_1223();
        object = (sprzkd)((sprwnd)object2).cfr_renamed_1224();
        sprimd sprimd2 = (sprimd)((sprwnd)object2).cfr_renamed_1225();
        return new KeyPair(new sprnhc((sprzkd)object), new sprqgc(sprimd2));
    }
}

