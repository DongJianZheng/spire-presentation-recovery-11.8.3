/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdrm;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprvrm;
import com.spire.presentation.packages.sprwci;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprxx;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprymm;
import com.spire.presentation.packages.sprytm;
import com.spire.presentation.packages.sprzkaa;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

public abstract class sprkel
implements sprxx {
    public Map cfr_renamed_91;
    public sprdul cfr_renamed_0;
    public sprdul cfr_renamed_1;
    public boolean cfr_renamed_2;
    private PrivateKey cfr_renamed_3;
    public boolean cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        Object object;
        if (sproul.cfr_renamed_7452(arg0.cfr_renamed_593())) {
            try {
                KeyAgreement keyAgreement;
                sprdrm sprdrm2 = sprdrm.cfr_renamed_23(arg2);
                sprvrm sprvrm2 = sprdrm2.cfr_renamed_10709();
                sprkel sprkel2 = this;
                KeyFactory keyFactory = sprkel2.cfr_renamed_1.cfr_renamed_10710(arg0.cfr_renamed_593());
                PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(sprvrm2.cfr_renamed_2096().cfr_renamed_91()));
                KeyAgreement keyAgreement2 = keyAgreement = sprkel2.cfr_renamed_1.cfr_renamed_7439(arg0.cfr_renamed_593());
                keyAgreement2.init((Key)this.cfr_renamed_3, new sprobi(sprvrm2.cfr_renamed_7453()));
                keyAgreement2.doPhase(publicKey, true);
                SecretKey secretKey = keyAgreement.generateSecret(sprqo.cfr_renamed_3.cfr_renamed_19());
                Cipher cipher = this.cfr_renamed_1.cfr_renamed_7430(sprqo.cfr_renamed_3);
                cipher.init(4, (Key)secretKey, new sprwci(sprvrm2.cfr_renamed_2105(), sprvrm2.cfr_renamed_7453()));
                sprymm sprymm2 = sprdrm2.cfr_renamed_10711();
                return cipher.unwrap(sproze.cfr_renamed_543(sprymm2.cfr_renamed_4010(), sprymm2.cfr_renamed_10712()), this.cfr_renamed_1.cfr_renamed_10713(arg1.cfr_renamed_593()), 3);
            }
            catch (Exception exception) {
                throw new sprlyl(new StringBuilder().insert(0, sprwff.cfr_renamed_9("wcq~bo{t|;gueiskbr||2pwb(;")).append(exception.getMessage()).toString(), exception);
            }
        }
        if (sprgz.cfr_renamed_96.cfr_renamed_5078(arg0.cfr_renamed_593())) {
            Object object2;
            sprytm sprytm2 = sprytm.cfr_renamed_23(arg0.cfr_renamed_284());
            sprkel sprkel3 = this;
            sprajg sprajg2 = this.cfr_renamed_1.cfr_renamed_10694(sprytm2.cfr_renamed_7446(), sprkel3.cfr_renamed_3).cfr_renamed_7454(this.cfr_renamed_4);
            if (!sprkel3.cfr_renamed_91.isEmpty()) {
                Object object3 = object2 = this.cfr_renamed_91.keySet().iterator();
                while (object3.hasNext()) {
                    sprlem sprlem2;
                    sprlem sprlem3 = sprlem2 = (sprlem)object2.next();
                    sprajg2.cfr_renamed_7451(sprlem3, (String)this.cfr_renamed_91.get(sprlem3));
                    object3 = object2;
                }
            }
            try {
                sprkel sprkel4 = this;
                object2 = sprkel4.cfr_renamed_1.cfr_renamed_10707(arg1.cfr_renamed_593(), sprajg2.cfr_renamed_7425(arg1, arg2));
                if (sprkel4.cfr_renamed_2) {
                    this.cfr_renamed_1.cfr_renamed_10708(arg1, (Key)object2);
                }
                return object2;
            }
            catch (spryhg spryhg2) {
                throw new sprlyl(new StringBuilder().insert(0, sprzkaa.cfr_renamed_9("m8k%x4a/f`}.\u007f2i0x)f'(+m92`")).append(spryhg2.getMessage()).toString(), spryhg2);
            }
        }
        sprkel sprkel5 = this;
        sprajg sprajg3 = sprkel5.cfr_renamed_1.cfr_renamed_10694(arg0, this.cfr_renamed_3).cfr_renamed_7454(this.cfr_renamed_4);
        if (!sprkel5.cfr_renamed_91.isEmpty()) {
            Object object4 = object = this.cfr_renamed_91.keySet().iterator();
            while (object4.hasNext()) {
                sprlem sprlem4;
                sprlem sprlem5 = sprlem4 = (sprlem)object.next();
                sprajg3.cfr_renamed_7451(sprlem5, (String)this.cfr_renamed_91.get(sprlem5));
                object4 = object;
            }
        }
        try {
            sprkel sprkel6 = this;
            object = sprkel6.cfr_renamed_1.cfr_renamed_10707(arg1.cfr_renamed_593(), sprajg3.cfr_renamed_7425(arg1, arg2));
            if (sprkel6.cfr_renamed_2) {
                this.cfr_renamed_1.cfr_renamed_10708(arg1, (Key)object);
            }
            return object;
        }
        catch (spryhg spryhg3) {
            throw new sprlyl(new StringBuilder().insert(0, sprwff.cfr_renamed_9("wcq~bo{t|;gueiskbr||2pwb(;")).append(spryhg3.getMessage()).toString(), spryhg3);
        }
    }

    public sprkel cfr_renamed_4045(String arg0) {
        this.cfr_renamed_0 = sproul.cfr_renamed_4046(arg0);
        return this;
    }

    public sprkel cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_1 = new sprdul(new sprdhl(arg0));
        this.cfr_renamed_0 = this.cfr_renamed_1;
        return this;
    }

    public sprkel cfr_renamed_4050(boolean arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprkel cfr_renamed_7454(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprkel cfr_renamed_1499(String arg0) {
        this.cfr_renamed_1 = new sprdul(new sprpfl(arg0));
        this.cfr_renamed_0 = this.cfr_renamed_1;
        return this;
    }

    public sprkel cfr_renamed_4051(Provider arg0) {
        this.cfr_renamed_0 = sproul.cfr_renamed_4052(arg0);
        return this;
    }

    public sprkel(PrivateKey privateKey) {
        sprkel sprkel2 = this;
        this.cfr_renamed_1 = new sprdul(new sprjrl());
        this.cfr_renamed_0 = this.cfr_renamed_1;
        this.cfr_renamed_91 = new HashMap();
        sprkel2.cfr_renamed_2 = false;
        sprkel2.cfr_renamed_3 = sproul.cfr_renamed_10695(privateKey);
    }

    public sprkel cfr_renamed_7451(sprlem arg0, String arg1) {
        sprkel sprkel2 = this;
        sprkel2.cfr_renamed_91.put(arg0, arg1);
        return sprkel2;
    }
}

