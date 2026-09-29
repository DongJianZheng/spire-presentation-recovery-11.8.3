/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcvg;
import com.spire.presentation.packages.sprcwg;
import com.spire.presentation.packages.sprczg;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhrm;
import com.spire.presentation.packages.sprlrl;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprlzg;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproah;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sprpbh;
import com.spire.presentation.packages.sprqgl;
import com.spire.presentation.packages.sprqpaa;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrwg;
import com.spire.presentation.packages.sprrxg;
import com.spire.presentation.packages.sprti;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprwrk;
import com.spire.presentation.packages.sprxll;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzgl;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.math.BigInteger;

public class sprjrg
implements sprti {
    private static final sprrwg cfr_renamed_3 = new sprrwg();
    private final sprmah cfr_renamed_4;

    @Override
    public sprbg cfr_renamed_7570(sproam arg0, spraxg arg1) throws sprtqg {
        return sprlxg.cfr_renamed_7956(arg0, arg1);
    }

    @Override
    public byte[] cfr_renamed_7780(int arg0, byte[][] arg1) throws sprtqg {
        try {
            Object object;
            Object object2;
            byte[] byArray;
            Object object3;
            Object object4;
            spryye spryye2 = cfr_renamed_3.cfr_renamed_7934(this.cfr_renamed_4);
            if (arg0 != 18) {
                sprxll sprxll2;
                sprwn sprwn2 = sprczg.cfr_renamed_7924(arg0);
                sprxll sprxll3 = new sprxll(sprwn2);
                sprxll3.cfr_renamed_5535(false, spryye2);
                if (arg0 == 2 || arg0 == 1) {
                    byte[] byArray2 = arg1[0];
                    sprxll3.cfr_renamed_2494(byArray2, 2, byArray2.length - 2);
                    sprxll2 = sprxll3;
                } else {
                    int n;
                    byte[][] byArray3;
                    sprwrk sprwrk2 = (sprwrk)spryye2;
                    int n2 = (sprwrk2.cfr_renamed_284().cfr_renamed_1155().bitLength() + 7) / 8;
                    byte[] byArray4 = new byte[n2];
                    byte[] byArray5 = arg1[0];
                    if (byArray5.length - 2 > n2) {
                        sprxll3.cfr_renamed_2494(byArray5, 3, byArray5.length - 3);
                        byArray3 = arg1;
                    } else {
                        System.arraycopy(byArray5, 2, byArray4, byArray4.length - (byArray5.length - 2), byArray5.length - 2);
                        sprxll3.cfr_renamed_2494(byArray4, 0, byArray4.length);
                        byArray3 = arg1;
                    }
                    byArray5 = byArray3[1];
                    int n3 = n = 0;
                    while (n3 != byArray4.length) {
                        byArray4[n++] = 0;
                        n3 = n;
                    }
                    if (byArray5.length - 2 > n2) {
                        sprxll3.cfr_renamed_2494(byArray5, 3, byArray5.length - 3);
                        sprxll2 = sprxll3;
                    } else {
                        System.arraycopy(byArray5, 2, byArray4, byArray4.length - (byArray5.length - 2), byArray5.length - 2);
                        sprxll3.cfr_renamed_2494(byArray4, 0, byArray4.length);
                        sprxll2 = sprxll3;
                    }
                }
                return sprxll2.cfr_renamed_1206();
            }
            sprvdm sprvdm2 = (sprvdm)this.cfr_renamed_4.cfr_renamed_7735().cfr_renamed_1521();
            byte[] byArray6 = arg1[0];
            int n = (((byArray6[0] & 0xFF) << 8) + (byArray6[1] & 0xFF) + 7) / 8;
            if (2 + n + 1 > byArray6.length) {
                throw new sprtqg(sprqpaa.cfr_renamed_9(";b=c:i:,2i0k*d~c+x~c8,,m0k;"));
            }
            byte[] byArray7 = new byte[n];
            System.arraycopy(byArray6, 2, byArray7, 0, n);
            int n4 = byArray6[n + 2] & 0xFF;
            if (2 + n + 1 + n4 > byArray6.length) {
                throw new sprtqg(sprlrl.cfr_renamed_9("\u0018O\u001eN\u0019D\u0019\u0001\u0011D\u0013F\tI]N\bU]N\u001b\u0001\u000f@\u0013F\u0018"));
            }
            byte[] byArray8 = new byte[n4];
            System.arraycopy(byArray6, 2 + n + 1, byArray8, 0, n4);
            if (sprvdm2.cfr_renamed_7813().cfr_renamed_5078(sprhrm.cfr_renamed_2)) {
                if (byArray7.length != 33 || 64 != byArray7[0]) {
                    throw new IllegalArgumentException(sprqpaa.cfr_renamed_9("\u0017b(m2e:,\u001dy,z;>k9o5~|+n2e=,5i'"));
                }
                object4 = new sprwgk(byArray7, 1);
                object3 = new sprzgl();
                ((sprzgl)object3).cfr_renamed_5692(spryye2);
                byArray = new byte[((sprzgl)object3).cfr_renamed_8005()];
                ((sprzgl)object3).cfr_renamed_8006((sprbj)object4, byArray, 0);
            } else {
                object4 = ((sprzuk)spryye2).cfr_renamed_284();
                object3 = new sprnzk(((sprqxk)object4).cfr_renamed_1769().cfr_renamed_2002(byArray7), (sprqxk)object4);
                object2 = new sprqgl();
                sprqgl sprqgl2 = object2;
                sprqgl2.cfr_renamed_5692(spryye2);
                object = sprqgl2.cfr_renamed_5695((sprbj)object3);
                byArray = sprhdf.cfr_renamed_512(sprqgl2.cfr_renamed_1938(), (BigInteger)object);
            }
            object4 = new sprpbh(new sprcvg().cfr_renamed_576(sprvdm2.cfr_renamed_579()), sprvdm2.cfr_renamed_7877());
            object3 = sprcwg.cfr_renamed_7876(this.cfr_renamed_4.cfr_renamed_7735(), new sprlzg());
            object2 = new sprtpk(((sprpbh)object4).cfr_renamed_7996(byArray, (byte[])object3));
            Object object5 = object = sprczg.cfr_renamed_8004(sprvdm2.cfr_renamed_7877());
            object5.cfr_renamed_5535(false, (sprbj)object2);
            return sproah.cfr_renamed_7903(object5.cfr_renamed_1579(byArray8, 0, byArray8.length));
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprlrl.cfr_renamed_9("\u0018Y\u001eD\rU\u0014N\u0013\u0001\u001eS\u0018@\tH\u0013F]T\u000eD\u000f\u0001\u0016D\u0004H\u0013F]L\u001cU\u0018S\u0014@\u0011\u001b]")).append(iOException.getMessage()).toString(), iOException);
        }
        catch (sprull sprull2) {
            throw new sprtqg(new StringBuilder().insert(0, sprqpaa.cfr_renamed_9(";t=i.x7c0,:i=~'|*e0k~\u007f;\u007f-e1b~e0j16~")).append(sprull2.getMessage()).toString(), sprull2);
        }
    }

    @Override
    public sprbg cfr_renamed_7567(sprojm arg0, spraxg arg1) throws sprtqg {
        return sprlxg.cfr_renamed_7953(arg0, arg1);
    }

    public sprjrg(sprmah sprmah2) {
        this.cfr_renamed_4 = sprmah2;
    }

    @Override
    public sprbg cfr_renamed_7568(boolean arg0, int arg1, byte[] arg2) throws sprtqg {
        sprmr sprmr2 = sprczg.cfr_renamed_8002(arg1);
        return sprrxg.cfr_renamed_8001(arg0, sprmr2, arg2);
    }
}

