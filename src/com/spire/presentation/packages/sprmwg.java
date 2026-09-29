/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprwcm;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprwmr;
import com.spire.presentation.packages.sprxil;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

public class sprmwg
implements sprrk {
    private final sprrr cfr_renamed_4;

    public sprmwg cfr_renamed_1498(Provider arg0) {
        return new sprmwg(new sprkhi(arg0));
    }

    public sprmwg cfr_renamed_1499(String arg0) {
        return new sprmwg(new sprxil(arg0));
    }

    private /* synthetic */ sprmwg(sprrr sprrr2) {
        this.cfr_renamed_4 = sprrr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7812(sprifm arg0) throws sprtqg {
        sprifm sprifm2 = arg0;
        sprar sprar2 = sprifm2.cfr_renamed_1521();
        if (sprifm2.cfr_renamed_3() <= 3) {
            sprwcm sprwcm2 = (sprwcm)sprar2;
            try {
                MessageDigest messageDigest = this.cfr_renamed_4.cfr_renamed_7438("MD5");
                byte[] byArray = new sprghm(sprwcm2.cfr_renamed_2295()).cfr_renamed_91();
                messageDigest.update(byArray, 2, byArray.length - 2);
                byArray = new sprghm(sprwcm2.cfr_renamed_2296()).cfr_renamed_91();
                messageDigest.update(byArray, 2, byArray.length - 2);
                return messageDigest.digest();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new sprtqg(sprnnp.cfr_renamed_9("=)0o*h8!0,~\u0005\u001a}"), noSuchAlgorithmException);
            }
            catch (NoSuchProviderException noSuchProviderException) {
                throw new sprtqg(sprwmr.cfr_renamed_9("\u0005f\b \u0012'\u0000n\bcFJ\"2"), noSuchProviderException);
            }
            catch (IOException iOException) {
                throw new sprtqg(new StringBuilder().insert(0, sprnnp.cfr_renamed_9("+?&y<~-0+1,;h5-'h='381&;&*;dh")).append(iOException.getMessage()).toString(), iOException);
            }
        }
        if (arg0.cfr_renamed_3() == 4) {
            try {
                MessageDigest messageDigest;
                byte[] byArray = arg0.cfr_renamed_7661();
                MessageDigest messageDigest2 = messageDigest = this.cfr_renamed_4.cfr_renamed_7438("SHA1");
                messageDigest2.update((byte)-103);
                messageDigest2.update((byte)(byArray.length >> 8));
                messageDigest.update((byte)byArray.length);
                MessageDigest messageDigest3 = messageDigest;
                messageDigest3.update(byArray);
                return messageDigest3.digest();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new sprtqg(sprwmr.cfr_renamed_9("d\u0007iAsFa\u000fi\u0002'5O'6"), noSuchAlgorithmException);
            }
            catch (NoSuchProviderException noSuchProviderException) {
                throw new sprtqg(sprnnp.cfr_renamed_9("+?&y<~.7&:h\r\u0000\u001fy"), noSuchProviderException);
            }
            catch (IOException iOException) {
                throw new sprtqg(new StringBuilder().insert(0, sprwmr.cfr_renamed_9("d\u0007iAsFb\bd\tc\u0003'\rb\u001f'\u0005h\u000bw\ti\u0003i\u0012t\\'")).append(iOException.getMessage()).toString(), iOException);
            }
        }
        if (arg0.cfr_renamed_3() != 6) {
            throw new sprwhm(new StringBuilder().insert(0, sprwmr.cfr_renamed_9("R\bt\u0013w\u0016h\u0014s\u0003cFW!WFl\u0003~Fq\u0003u\u0015n\ti\\'")).append(arg0.cfr_renamed_3()).toString());
        }
        try {
            MessageDigest messageDigest;
            byte[] byArray = arg0.cfr_renamed_7661();
            MessageDigest messageDigest4 = messageDigest = this.cfr_renamed_4.cfr_renamed_7438("SHA256");
            messageDigest4.update((byte)-101);
            messageDigest4.update((byte)(byArray.length >> 24));
            messageDigest.update((byte)(byArray.length >> 16));
            messageDigest.update((byte)(byArray.length >> 8));
            messageDigest.update((byte)byArray.length);
            MessageDigest messageDigest5 = messageDigest;
            messageDigest5.update(byArray);
            return messageDigest5.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprtqg(sprnnp.cfr_renamed_9("+?&y<~.7&:h\r\u0000\u001fzk~"), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprtqg(sprwmr.cfr_renamed_9("d\u0007iAsFa\u000fi\u0002'5O'5S1"), noSuchProviderException);
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprnnp.cfr_renamed_9("+?&y<~-0+1,;h5-'h='381&;&*;dh")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprmwg() {
        this(new sprrul());
    }
}

