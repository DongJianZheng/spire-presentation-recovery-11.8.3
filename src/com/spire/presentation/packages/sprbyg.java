/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprje;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprovk;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprprca;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtyk;
import com.spire.presentation.packages.sprvxd;
import java.io.IOException;
import java.io.OutputStream;

public class sprbyg
implements sprje {
    public static byte[] cfr_renamed_7888(sprth arg0, int arg1, sprpik arg2, char[] arg3) throws sprtqg {
        sprsm sprsm2;
        sprsm sprsm3;
        return sprbyg.cfr_renamed_7889(arg2 != null && arg2.cfr_renamed_324() != 4 ? (sprsm3 = arg0.cfr_renamed_576(arg2.cfr_renamed_579())) : (sprsm2 = arg0.cfr_renamed_576(1)), arg1, arg2, arg3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_7889(sprsm arg0, int arg1, sprpik arg2, char[] arg3) throws sprtqg {
        int n;
        char[] cArray;
        String string = null;
        int n2 = 0;
        switch (arg1) {
            case 2: {
                n2 = 192;
                string = sprprca.cfr_renamed_9("p\u0013g\tq\u0012q");
                cArray = arg3;
                break;
            }
            case 1: {
                n2 = 128;
                string = sprvxd.cfr_renamed_9("l=`8");
                cArray = arg3;
                break;
            }
            case 3: {
                n2 = 128;
                string = sprprca.cfr_renamed_9("w\u0017g\u0002\u0001");
                cArray = arg3;
                break;
            }
            case 4: {
                n2 = 128;
                string = sprvxd.cfr_renamed_9("g\u0015J\u000eC\u0010V\u0011");
                cArray = arg3;
                break;
            }
            case 5: {
                n2 = 128;
                string = sprprca.cfr_renamed_9("g\u0017r\u0013f");
                cArray = arg3;
                break;
            }
            case 6: {
                n2 = 64;
                string = "DES";
                cArray = arg3;
                break;
            }
            case 7: {
                n2 = 128;
                string = sprvxd.cfr_renamed_9("8`*");
                cArray = arg3;
                break;
            }
            case 8: {
                n2 = 192;
                string = sprprca.cfr_renamed_9("u\u0013g");
                cArray = arg3;
                break;
            }
            case 9: {
                n2 = 256;
                string = sprvxd.cfr_renamed_9("8`*");
                cArray = arg3;
                break;
            }
            case 10: {
                n2 = 256;
                string = sprprca.cfr_renamed_9("`![0]%\\");
                cArray = arg3;
                break;
            }
            case 11: {
                n2 = 128;
                string = sprvxd.cfr_renamed_9("f\u0018H\u001cI\u0015L\u0018");
                cArray = arg3;
                break;
            }
            case 12: {
                n2 = 192;
                string = sprprca.cfr_renamed_9("\u0015U;Q:X?U");
                cArray = arg3;
                break;
            }
            case 13: {
                n2 = 256;
                string = sprvxd.cfr_renamed_9("f\u0018H\u001cI\u0015L\u0018");
                cArray = arg3;
                break;
            }
            default: {
                throw new sprtqg(new StringBuilder().insert(0, sprprca.cfr_renamed_9("A8_8[!ZvG/Y;Q\"F?WvU:S9F?@>Yl\u0014")).append(arg1).toString());
            }
        }
        byte[] byArray = sprkoe.cfr_renamed_432(cArray);
        byte[] byArray2 = new byte[(n2 + 7) / 8];
        int n3 = 0;
        int n4 = 0;
        if (arg2 != null) {
            if (arg2.cfr_renamed_324() == 4) {
                sprovk sprovk2 = new sprovk(2).cfr_renamed_7890(arg2.cfr_renamed_1205()).cfr_renamed_7891(arg2.cfr_renamed_7892()).cfr_renamed_7893(arg2.cfr_renamed_7894()).cfr_renamed_7895(arg2.cfr_renamed_7896()).cfr_renamed_7897(19);
                sprtyk sprtyk2 = new sprtyk();
                sprtyk2.cfr_renamed_7898(sprovk2.cfr_renamed_1451());
                sprtyk2.cfr_renamed_7899(arg3, byArray2);
                return byArray2;
            }
            if (arg2.cfr_renamed_579() != arg0.cfr_renamed_593()) {
                throw new sprtqg(sprvxd.cfr_renamed_9("\n\u0017\u0012\n\u001dL\u001e@\nQ:D\u0015F\fI\u0018Q\u0016WYH\u0010V\u0014D\rF\u0011"));
            }
        } else if (arg0.cfr_renamed_593() != 1) {
            throw new sprtqg(sprprca.cfr_renamed_9("2]1Q%@\u0015U:W#X7@9FvZ9@vR9Fvy\u0012\u0001"));
        }
        OutputStream outputStream = arg0.cfr_renamed_470();
        try {
            while (n3 < byArray2.length) {
                int n5;
                block37: {
                    int n6;
                    block38: {
                        int n7;
                        if (arg2 == null) break block38;
                        int n8 = n7 = 0;
                        while (n8 != n4) {
                            outputStream.write(0);
                            n8 = ++n7;
                        }
                        sprpik sprpik2 = arg2;
                        byte[] byArray3 = sprpik2.cfr_renamed_1205();
                        switch (sprpik2.cfr_renamed_324()) {
                            case 0: {
                                outputStream.write(byArray);
                                break block37;
                            }
                            case 1: {
                                outputStream.write(byArray3);
                                outputStream.write(byArray);
                                break block37;
                            }
                            case 3: {
                                long l = arg2.cfr_renamed_1478();
                                OutputStream outputStream2 = outputStream;
                                outputStream2.write(byArray3);
                                outputStream2.write(byArray);
                                long l2 = l = l - (long)(byArray3.length + byArray.length);
                                while (l2 > 0L) {
                                    OutputStream outputStream3 = outputStream;
                                    if (l < (long)byArray3.length) {
                                        outputStream3.write(byArray3, 0, (int)l);
                                        break block37;
                                    }
                                    outputStream3.write(byArray3);
                                    if ((l -= (long)byArray3.length) < (long)byArray.length) {
                                        outputStream.write(byArray, 0, (int)l);
                                        l2 = l = 0L;
                                        continue;
                                    }
                                    outputStream.write(byArray);
                                    l2 = l = l - (long)byArray.length;
                                }
                                break block37;
                            }
                            default: {
                                throw new sprtqg(new StringBuilder().insert(0, sprvxd.cfr_renamed_9("P\u0017N\u0017J\u000eKYvKnYQ\u0000U\u001c\u001fY")).append(arg2.cfr_renamed_324()).toString());
                            }
                        }
                    }
                    int n9 = n6 = 0;
                    while (n9 != n4) {
                        outputStream.write(0);
                        n9 = ++n6;
                    }
                    outputStream.write(byArray);
                }
                outputStream.close();
                byte[] byArray4 = arg0.cfr_renamed_580();
                if (byArray4.length > byArray2.length - n3) {
                    System.arraycopy(byArray4, 0, byArray2, n3, byArray2.length - n3);
                    n5 = n3;
                } else {
                    System.arraycopy(byArray4, 0, byArray2, n3, byArray4.length);
                    n5 = n3;
                }
                ++n4;
                n3 = n5 + byArray4.length;
            }
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprprca.cfr_renamed_9("3L5Q&@?[8\u00145U:W#X7@?Z1\u00142]1Q%@l\u0014")).append(iOException.getMessage()).toString(), iOException);
        }
        int n10 = n = 0;
        while (n10 != byArray.length) {
            byArray[n++] = 0;
            n10 = n;
        }
        return byArray2;
    }
}

