/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfvm;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprsjg;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprxem;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.sprytk;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class sprcok {
    private static Set cfr_renamed_4 = new HashSet(5);

    private static /* synthetic */ void cfr_renamed_9436(byte[] arg0, int arg1, int arg2, BigInteger arg3) {
        int n;
        byte[] byArray = arg3.toByteArray();
        if (byArray.length < arg1) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != arg1) {
            int n3 = arg2 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ sprcok() {
    }

    public static sprvhm cfr_renamed_5658(spryye arg0) throws IOException {
        if (arg0 instanceof sprkik) {
            sprkik sprkik2 = (sprkik)arg0;
            return new sprvhm(new sprddm(sprdl.cfr_renamed_1205, sprpen.cfr_renamed_4), new sprfvm(sprkik2.cfr_renamed_2295(), sprkik2.cfr_renamed_360()));
        }
        if (arg0 instanceof sprytk) {
            sprytk sprytk2 = (sprytk)arg0;
            sprxem sprxem2 = null;
            sprmqk sprmqk2 = sprytk2.cfr_renamed_284();
            if (sprmqk2 != null) {
                sprxem2 = new sprxem(sprmqk2.cfr_renamed_1155(), sprmqk2.cfr_renamed_1604(), sprmqk2.cfr_renamed_1145());
            }
            return new sprvhm(new sprddm(sprbr.cfr_renamed_84, sprxem2), new sprktm(sprytk2.spr\u3181()));
        }
        if (arg0 instanceof sprnzk) {
            Object object;
            sprnzk sprnzk2;
            sprcgm sprcgm2;
            sprnzk sprnzk3 = (sprnzk)arg0;
            sprqxk sprqxk2 = sprnzk3.cfr_renamed_284();
            if (sprqxk2 == null) {
                sprcgm2 = new sprcgm(sprpen.cfr_renamed_4);
                sprnzk2 = sprnzk3;
            } else {
                if (sprqxk2 instanceof sprbuk) {
                    int n;
                    sprlem sprlem2;
                    int n2;
                    int n3;
                    sprbuk sprbuk2 = (sprbuk)sprqxk2;
                    sprnzk sprnzk4 = sprnzk3;
                    BigInteger bigInteger = sprnzk4.cfr_renamed_1604().cfr_renamed_1969().cfr_renamed_1779();
                    BigInteger bigInteger2 = sprnzk4.cfr_renamed_1604().cfr_renamed_1973().cfr_renamed_1779();
                    sprxum sprxum2 = new sprxum(sprbuk2.cfr_renamed_2106(), sprbuk2.cfr_renamed_2107());
                    if (cfr_renamed_4.contains(sprbuk2.cfr_renamed_2106())) {
                        n3 = 64;
                        n2 = 32;
                        sprlem2 = sprqo.cfr_renamed_93;
                        n = n3;
                    } else {
                        boolean bl;
                        boolean bl2 = bl = bigInteger.bitLength() > 256;
                        if (bl) {
                            n3 = 128;
                            n2 = 64;
                            sprlem2 = sprdt.cfr_renamed_91;
                            n = n3;
                        } else {
                            n3 = 64;
                            n2 = 32;
                            sprlem2 = sprdt.cfr_renamed_96;
                            n = n3;
                        }
                    }
                    byte[] byArray = new byte[n];
                    sprcok.cfr_renamed_9436(byArray, n3 / 2, 0, bigInteger);
                    sprcok.cfr_renamed_9436(byArray, n3 / 2, n2, bigInteger2);
                    try {
                        return new sprvhm(new sprddm(sprlem2, sprxum2), new sprfvg(byArray));
                    }
                    catch (IOException iOException) {
                        return null;
                    }
                }
                if (sprqxk2 instanceof sprxrk) {
                    sprcgm2 = new sprcgm(((sprxrk)sprqxk2).cfr_renamed_313());
                    sprnzk2 = sprnzk3;
                } else {
                    object = new sprhfm(sprqxk2.cfr_renamed_1769(), new sprfim(sprqxk2.cfr_renamed_1145(), false), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153(), sprqxk2.cfr_renamed_2113());
                    sprcgm2 = new sprcgm((sprhfm)object);
                    sprnzk2 = sprnzk3;
                }
            }
            object = sprnzk2.cfr_renamed_1604().cfr_renamed_1972(false);
            return new sprvhm(new sprddm(sprbr.cfr_renamed_135, sprcgm2), (byte[])object);
        }
        if (arg0 instanceof sprlnk) {
            sprlnk sprlnk2 = (sprlnk)arg0;
            return new sprvhm(new sprddm(sprtu.cfr_renamed_4), sprlnk2.cfr_renamed_91());
        }
        if (arg0 instanceof sprwgk) {
            sprwgk sprwgk2 = (sprwgk)arg0;
            return new sprvhm(new sprddm(sprtu.cfr_renamed_3), sprwgk2.cfr_renamed_91());
        }
        if (arg0 instanceof sprpxk) {
            sprpxk sprpxk2 = (sprpxk)arg0;
            return new sprvhm(new sprddm(sprtu.cfr_renamed_2), sprpxk2.cfr_renamed_91());
        }
        if (arg0 instanceof sprnuk) {
            sprnuk sprnuk2 = (sprnuk)arg0;
            return new sprvhm(new sprddm(sprtu.cfr_renamed_0), sprnuk2.cfr_renamed_91());
        }
        throw new IOException(sprsjg.cfr_renamed_9("y\u0006kCb\u0002`\u0002\u007f\u0006f\u0006`\u00102\r}\u00172\u0011w\u0000}\u0004|\nh\u0006v"));
    }

    static {
        cfr_renamed_4.add(sprqo.cfr_renamed_272);
        cfr_renamed_4.add(sprqo.cfr_renamed_88);
        cfr_renamed_4.add(sprqo.cfr_renamed_185);
        cfr_renamed_4.add(sprqo.cfr_renamed_953);
        cfr_renamed_4.add(sprqo.cfr_renamed_105);
    }
}

