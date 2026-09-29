/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprcvg;
import com.spire.presentation.packages.sprcwg;
import com.spire.presentation.packages.sprczg;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprlzg;
import com.spire.presentation.packages.sprlzk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproah;
import com.spire.presentation.packages.sprpbh;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprqgl;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrwg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprvmk;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprygaa;
import com.spire.presentation.packages.spryqg;
import com.spire.presentation.packages.spryy;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzgl;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprxbh
extends spryqg {
    private SecureRandom cfr_renamed_2;
    private static final byte cfr_renamed_3 = 64;
    private sprrwg cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_8003(sprvdm arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4) throws IOException, sprtqg {
        spryy spryy2;
        sprpbh sprpbh2 = new sprpbh(new sprcvg().cfr_renamed_576(arg0.cfr_renamed_579()), arg0.cfr_renamed_7877());
        sprtpk sprtpk2 = new sprtpk(sprpbh2.cfr_renamed_7996(arg2, arg3));
        byte[] byArray = sproah.cfr_renamed_7902(arg1, (boolean)this.cfr_renamed_2);
        spryy spryy3 = spryy2 = sprczg.cfr_renamed_8004(arg0.cfr_renamed_7877());
        spryy3.cfr_renamed_5535(true, new sprbgk(sprtpk2, this.cfr_renamed_2));
        byte[] byArray2 = spryy3.cfr_renamed_1575(byArray, 0, byArray.length);
        byte[] byArray3 = new sprghm(new BigInteger(1, arg4)).cfr_renamed_91();
        byte[] byArray4 = new byte[byArray3.length + 1 + byArray2.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        byArray4[byArray3.length] = (byte)byArray2.length;
        System.arraycopy(byArray2, 0, byArray4, byArray3.length + 1, byArray2.length);
        return byArray4;
    }

    @Override
    public byte[] cfr_renamed_7884(sprvbh arg0, byte[] arg1) throws sprtqg {
        spryye spryye2;
        block5: {
            sprqgl sprqgl2;
            byte[] byArray;
            sprvdm sprvdm2;
            block6: {
                spryye2 = this.cfr_renamed_4.cfr_renamed_7926(arg0);
                if (arg0.cfr_renamed_593() != 18) break block5;
                sprifm sprifm2 = arg0.cfr_renamed_7735();
                sprvdm2 = (sprvdm)sprifm2.cfr_renamed_1521();
                byArray = sprcwg.cfr_renamed_7876(sprifm2, new sprlzg());
                if (!sprvdm2.cfr_renamed_7813().cfr_renamed_5078(sprhrm.cfr_renamed_2)) break block6;
                sprlzk sprlzk2 = new sprlzk();
                sprlzk2.cfr_renamed_5536(new sprvmk(this.cfr_renamed_2));
                sprsil sprsil2 = sprlzk2.cfr_renamed_1223();
                sprzgl sprzgl2 = new sprzgl();
                sprzgl2.cfr_renamed_5692(sprsil2.cfr_renamed_1225());
                byte[] byArray2 = new byte[sprzgl2.cfr_renamed_8005()];
                sprzgl2.cfr_renamed_8006(spryye2, byArray2, 0);
                byte[] byArray3 = new byte[33];
                byArray3[0] = 64;
                ((sprwgk)sprsil2.cfr_renamed_1224()).cfr_renamed_8007(byArray3, 1);
                return this.cfr_renamed_8003(sprvdm2, arg1, byArray2, byArray, byArray3);
            }
            sprqxk sprqxk2 = ((sprnzk)spryye2).cfr_renamed_284();
            sprqal sprqal2 = new sprqal();
            sprqal2.cfr_renamed_5536(new sprftk(sprqxk2, this.cfr_renamed_2));
            sprsil sprsil3 = sprqal2.cfr_renamed_1223();
            sprqgl sprqgl3 = sprqgl2 = new sprqgl();
            sprqgl3.cfr_renamed_5692(sprsil3.cfr_renamed_1225());
            BigInteger bigInteger = sprqgl3.cfr_renamed_5695(spryye2);
            byte[] byArray4 = sprhdf.cfr_renamed_512(sprqgl3.cfr_renamed_1938(), bigInteger);
            byte[] byArray5 = ((sprnzk)sprsil3.cfr_renamed_1224()).cfr_renamed_1604().cfr_renamed_1972(false);
            return this.cfr_renamed_8003(sprvdm2, arg1, byArray4, byArray, byArray5);
        }
        try {
            sprwn sprwn2;
            sprwn sprwn3 = sprwn2 = sprczg.cfr_renamed_7924(arg0.cfr_renamed_593());
            sprwn3.cfr_renamed_5535(true, new sprbgk(spryye2, this.cfr_renamed_2));
            return sprwn3.cfr_renamed_1337(arg1, 0, arg1.length);
        }
        catch (sprull sprull2) {
            throw new sprtqg(new StringBuilder().insert(0, sprahe.cfr_renamed_9("?'9:*+304\u007f?19-#/.648z,?,)651z6495ez")).append(sprull2.getMessage()).toString(), sprull2);
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprygaa.cfr_renamed_9("SHUUFD__X\u0010S^UBO@BYXW\u0016CSCEYY^\u0016YXVY\n\u0016")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprxbh cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprxbh(sprvbh sprvbh2) {
        super(sprvbh2);
        sprxbh sprxbh2 = this;
        sprxbh2.cfr_renamed_4 = new sprrwg();
    }
}

