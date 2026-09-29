/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprhlm;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprhum;
import com.spire.presentation.packages.sprhzl;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprmom;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprssm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtza;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprevm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_132 = 2;
    private int cfr_renamed_102;
    public static final int cfr_renamed_93 = 1;
    private sprco cfr_renamed_86;
    public static final int cfr_renamed_152 = 0;
    public static final int cfr_renamed_112 = 8;
    public static final int cfr_renamed_119 = 5;
    public static final int cfr_renamed_91 = 3;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 7;
    public static final int cfr_renamed_2 = 6;
    private static final boolean[] cfr_renamed_3;
    private sprrdm cfr_renamed_4;

    public String toString() {
        return new StringBuilder().insert(0, sprtza.cfr_renamed_9("\u0015u$d\u0013d5D9{3~vk\\")).append(this.cfr_renamed_86).append(sprbff.cfr_renamed_9("a\"")).toString();
    }

    public static sprevm[] cfr_renamed_11254(sprszm arg0) {
        int n;
        sprevm[] sprevmArray = new sprevm[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprevmArray.length) {
            int n3 = n++;
            sprevmArray[n3] = sprevm.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprevmArray;
    }

    public sprevm(sprrdm sprrdm2) {
        sprevm sprevm2 = this;
        sprevm2.cfr_renamed_102 = -1;
        sprevm2.cfr_renamed_4 = sprrdm2;
    }

    public static sprevm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprevm) {
            return (sprevm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprevm(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        if (arg0 != null) {
            return new sprevm(sprrdm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 == null) {
            sprevm sprevm2 = this;
            return new sprycn(cfr_renamed_3[this.cfr_renamed_102], sprevm2.cfr_renamed_102, sprevm2.cfr_renamed_86);
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprevm(sprnvm sprnvm2) {
        sprevm sprevm2 = this;
        sprevm2.cfr_renamed_102 = sprnvm2.cfr_renamed_312();
        switch (sprevm2.cfr_renamed_102) {
            case 0: {
                void arg0;
                this.cfr_renamed_86 = sprndm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_86 = sprhum.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_86 = sprhmm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_86 = sprlvm.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 4: {
                void arg0;
                this.cfr_renamed_86 = sprffm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 5: {
                void arg0;
                this.cfr_renamed_86 = sprhlm.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 6: {
                void arg0;
                this.cfr_renamed_86 = sprssm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 7: {
                void arg0;
                this.cfr_renamed_86 = sprmom.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 8: {
                void arg0;
                this.cfr_renamed_86 = sprhzl.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtza.cfr_renamed_9("\u0003~=~9g80\"q1*v")).append(this.cfr_renamed_102).toString());
    }

    public int cfr_renamed_312() {
        return this.cfr_renamed_102;
    }

    static {
        boolean[] blArray = new boolean[9];
        blArray[0] = 0;
        blArray[1] = 1;
        blArray[2] = false;
        blArray[3] = true;
        blArray[4] = false;
        blArray[5] = true;
        blArray[6] = false;
        blArray[7] = false;
        blArray[8] = true;
        cfr_renamed_3 = blArray;
    }

    public sprrdm cfr_renamed_4780() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprevm(int n, sprco sprco2) {
        void arg0;
        sprevm sprevm2 = this;
        sprevm2.cfr_renamed_102 = arg0;
        sprevm2.cfr_renamed_86 = sprco2;
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_86;
    }
}

