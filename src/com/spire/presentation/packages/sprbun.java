/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprhig;
import com.spire.presentation.packages.sprjun;
import com.spire.presentation.packages.sprnac;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprbun
extends sprjun {
    private static final int cfr_renamed_3 = 129;
    private static final int cfr_renamed_4 = 128;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        sprbun sprbun2;
        int n;
        byte[] byArray = new byte[128];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < arg2) {
            int n7 = arg1 + n;
            if (n5 != 0) {
                n3 = arg0[n7] & 0xFF;
                n4 = arg0[n7 - 1] & 0xFF;
            }
            switch (n5) {
                case 0: {
                    n5 = 1;
                    n2 = 0;
                    break;
                }
                case 1: {
                    if (n3 == n4) {
                        n5 = 3;
                        n2 = 2;
                        break;
                    }
                    n5 = 2;
                    byArray[0] = (byte)n4;
                    n2 = 1;
                    break;
                }
                case 2: {
                    if (n3 == n4) {
                        this.cfr_renamed_14909(byArray, n2);
                        n5 = 3;
                        n2 = 2;
                        break;
                    }
                    byArray[n2++] = (byte)n4;
                    if (n2 != 128) break;
                    this.cfr_renamed_14909(byArray, n2);
                    n5 = 1;
                    n2 = 0;
                    break;
                }
                case 3: {
                    if (n3 != n4) {
                        this.cfr_renamed_14910(n4, n2);
                        n5 = 1;
                        n2 = 0;
                        break;
                    }
                    if (++n2 != 128) break;
                    this.cfr_renamed_14910(n3, n2);
                    n5 = 0;
                    break;
                }
                default: {
                    throw new IllegalStateException(sprnac.cfr_renamed_9("S\u001fm\u001fi\u0006hQT=CQu\u0005g\u0005c_"));
                }
            }
            n6 = ++n;
        }
        switch (n5) {
            case 1: 
            case 2: {
                byArray[n2++] = (byte)n3;
                sprbun sprbun3 = this;
                sprbun2 = sprbun3;
                sprbun3.cfr_renamed_14909(byArray, n2);
                break;
            }
            case 3: {
                sprbun sprbun4 = this;
                sprbun2 = sprbun4;
                sprbun4.cfr_renamed_14910(n3, n2);
                break;
            }
            default: {
                throw new IllegalStateException(sprhig.cfr_renamed_9("g\u0005Y\u0005]\u001c\\K`'wKA\u001fS\u001fWE"));
            }
        }
        super.cfr_renamed_470().cfr_renamed_11594((byte)-127);
    }

    @sprtea
    public sprbun(spreen arg0) {
        super(arg0);
    }

    private /* synthetic */ void cfr_renamed_14909(byte[] arg0, int arg1) {
        sprbun sprbun2 = this;
        super.cfr_renamed_470().cfr_renamed_11594((byte)(arg1 - 1));
        super.cfr_renamed_470().cfr_renamed_4924(arg0, 0, arg1);
    }

    private /* synthetic */ void cfr_renamed_14910(int arg0, int arg1) {
        sprbun sprbun2 = this;
        super.cfr_renamed_470().cfr_renamed_11594((byte)(257 - arg1));
        super.cfr_renamed_470().cfr_renamed_11594((byte)arg0);
    }
}

