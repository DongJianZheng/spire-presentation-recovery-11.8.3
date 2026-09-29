/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprhva;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprnra;
import com.spire.presentation.packages.sprtlo;
import com.spire.presentation.packages.sprula;

public class sprira
extends sprnra {
    public sprmpa cfr_renamed_3;
    public int[][] cfr_renamed_4;

    private /* synthetic */ int[] cfr_renamed_1081(int[] arg0, int arg1) {
        int n;
        int[] nArray = new int[arg0.length];
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            nArray[n3] = this.cfr_renamed_3.cfr_renamed_838(arg0[n3], arg1);
            n2 = n;
        }
        return nArray;
    }

    @Override
    public sprnra cfr_renamed_882(sprnra arg0) {
        throw new RuntimeException(sprhql.cfr_renamed_9("KHq\u0007lJuK`J`IqBa\t"));
    }

    @Override
    public String toString() {
        int n;
        String string = (int)this.cfr_renamed_3 + sprtlo.cfr_renamed_9("Q>Q") + this.cfr_renamed_0 + sprhql.cfr_renamed_9("\u0007HFqUl_%HsBw\u0007") + this.cfr_renamed_3.toString() + sprtlo.cfr_renamed_9("Kf{");
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_0) {
                sprira sprira2 = this;
                StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(sprira2.cfr_renamed_3.cfr_renamed_867(sprira2.cfr_renamed_4[n][n3]));
                string = stringBuilder.append(sprhql.cfr_renamed_9("\u0007?\u0007")).toString();
                n4 = ++n3;
            }
            string = new StringBuilder().insert(0, string).append("\n").toString();
            n2 = ++n;
        }
        return string;
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_0) {
                if (this.cfr_renamed_4[n][n3] != 0) {
                    return false;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ void cfr_renamed_1082(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = arg1.length - 1;
        while (n2 >= 0) {
            int n3 = n;
            int n4 = this.cfr_renamed_3.cfr_renamed_825(arg0[n3], arg1[n]);
            arg1[n3] = n4;
            n2 = --n;
        }
    }

    @Override
    public sprnra cfr_renamed_879(sprkqa arg0) {
        throw new RuntimeException(sprtlo.cfr_renamed_9("\b\u001e2Q/\u001c6\u001d#\u001c#\u001f2\u0014\"_"));
    }

    public sprira(sprira arg0) {
        int n;
        sprira sprira2 = this;
        sprira sprira3 = arg0;
        this.cfr_renamed_3 = sprira3.cfr_renamed_3;
        this.cfr_renamed_0 = sprira3.cfr_renamed_0;
        sprira2.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprira2.cfr_renamed_4 = new int[this.cfr_renamed_3][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprhva.cfr_renamed_535(arg0.cfr_renamed_4[n3]);
            n2 = n;
        }
    }

    public int hashCode() {
        int n;
        int n2 = (this.cfr_renamed_3.hashCode() * 31 + this.cfr_renamed_3) * 31 + this.cfr_renamed_0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < this.cfr_renamed_0) {
                n2 = n2 * 31 + this.cfr_renamed_4[n][n4++];
                n5 = n4;
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public sprira(sprmpa sprmpa2, int[][] nArray) {
        void arg1;
        void arg0;
        sprira sprira2 = this;
        this.cfr_renamed_3 = arg0;
        sprira2.cfr_renamed_4 = arg1;
        sprira2.cfr_renamed_3 = (sprmpa)nArray.length;
        this.cfr_renamed_0 = ((void)arg1[0]).length;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_1083(int[][] nArray, int n, int n2) {
        void arg2;
        int[][] arg0;
        int[] nArray2 = nArray[n];
        nArray[arg1] = arg0[arg2];
        arg0[arg2] = nArray2;
    }

    @Override
    public sprula cfr_renamed_881(sprula arg0) {
        throw new RuntimeException(sprhql.cfr_renamed_9("KHq\u0007lJuK`J`IqBa\t"));
    }

    @Override
    public byte[] cfr_renamed_91() {
        int n;
        int n2 = 8;
        int n3 = 1;
        sprira sprira2 = this;
        while (sprira2.cfr_renamed_3.cfr_renamed_813() > n2) {
            n2 += 8;
            sprira2 = this;
            ++n3;
        }
        sprira sprira3 = this;
        byte[] byArray = new byte[sprira3.cfr_renamed_3 * sprira3.cfr_renamed_0 * n3 + 4];
        byArray[0] = (byte)(this.cfr_renamed_3 & 0xFF);
        byArray[1] = (byte)(this.cfr_renamed_3 >>> 8 & 0xFF);
        byArray[2] = (byte)(this.cfr_renamed_3 >>> 16 & 0xFF);
        byArray[3] = (byte)(this.cfr_renamed_3 >>> 24 & 0xFF);
        n3 = 4;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_0) {
                int n7;
                int n8 = n7 = 0;
                while (n8 < n2) {
                    int n9 = n3++;
                    byte by = (byte)(this.cfr_renamed_4[n][n5] >>> n7);
                    byArray[n9] = by;
                    n8 = n7 += 8;
                }
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprira(sprmpa sprmpa2, byte[] byArray) {
        int n;
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = v0;
        this.cfr_renamed_3 = v0;
        int n2 = 8;
        int n3 = 1;
        while (v1.cfr_renamed_813() > n2) {
            n2 += 8;
            v1 = arg0;
            ++n3;
        }
        if (((void)arg1).length < 5) {
            throw new IllegalArgumentException(sprtlo.cfr_renamed_9("f44\u0003)\u0003|Q!\u00180\u0014(Q'\u00034\u0010?Q/\u0002f\u001f)\u0005f\u0014(\u0012)\u0015#\u0015f\u001c'\u00054\u0018>Q)\u0007#\u0003f6\u0000Yt/+X"));
        }
        this.cfr_renamed_3 = (sprmpa)((arg1[3] & 0xFF) << 24 ^ (arg1[2] & 0xFF) << 16 ^ (arg1[1] & 0xFF) << 8 ^ arg1[0] & 0xFF);
        int n4 = n3 * this.cfr_renamed_3;
        if (this.cfr_renamed_3 <= 0 || (((void)arg1).length - 4) % n4 != 0) {
            throw new IllegalArgumentException(sprhql.cfr_renamed_9("%bwUjU?\u0007bNsBk\u0007dUwF|\u0007lT%IjS%BkDjC`C%JdSwN}\u0007jQ`U%`C\u000f7yh\u000e"));
        }
        this.cfr_renamed_0 = (((void)arg1).length - 4) / n4;
        this.cfr_renamed_4 = new int[this.cfr_renamed_3][this.cfr_renamed_0];
        n3 = 4;
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_3) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < this.cfr_renamed_0) {
                int n8;
                int n9 = n8 = 0;
                while (n9 < n2) {
                    int[] nArray = this.cfr_renamed_4[n];
                    int n10 = n6;
                    int n11 = arg1[n3] & 0xFF;
                    ++n3;
                    int n12 = nArray[n10] ^ n11 << n8;
                    nArray[n10] = n12;
                    n9 = n8 += 8;
                }
                sprira sprira2 = this;
                if (!sprira2.cfr_renamed_3.cfr_renamed_839(sprira2.cfr_renamed_4[n][n6])) {
                    throw new IllegalArgumentException(sprtlo.cfr_renamed_9("f44\u0003)\u0003|Q!\u00180\u0014(Q'\u00034\u0010?Q/\u0002f\u001f)\u0005f\u0014(\u0012)\u0015#\u0015f\u001c'\u00054\u0018>Q)\u0007#\u0003f6\u0000Yt/+X"));
                }
                n7 = ++n6;
            }
            n5 = ++n;
        }
    }

    public boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof sprira)) {
            return false;
        }
        sprira sprira2 = (sprira)arg0;
        if (!this.cfr_renamed_3.equals(sprira2.cfr_renamed_3) || sprira2.cfr_renamed_3 != this.cfr_renamed_0 || sprira2.cfr_renamed_0 != this.cfr_renamed_0) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_0) {
                if (this.cfr_renamed_4[n][n3] != sprira2.cfr_renamed_4[n][n3]) {
                    return false;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ void cfr_renamed_1084(int[] arg0, int arg1) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            arg0[--n] = this.cfr_renamed_3.cfr_renamed_838(arg0[n], arg1);
            n2 = n;
        }
    }

    @Override
    public sprula cfr_renamed_880(sprula arg0) {
        throw new RuntimeException(sprhql.cfr_renamed_9("KHq\u0007lJuK`J`IqBa\t"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public sprnra cfr_renamed_875() {
        boolean bl;
        reference var3_5;
        reference var2_2;
        sprira sprira2 = this;
        if (sprira2.cfr_renamed_3 != sprira2.cfr_renamed_0) {
            throw new ArithmeticException(sprtlo.cfr_renamed_9("<'\u00054\u0018>Q/\u0002f\u001f)\u0005f\u0018(\u0007#\u00032\u0018$\u001d#_"));
        }
        sprira sprira3 = this;
        int[][] nArray = new int[sprira3.cfr_renamed_3][sprira3.cfr_renamed_3];
        reference v2 = var2_2 = this.cfr_renamed_3 - true;
        while (v2 >= 0) {
            void nArray2;
            void v3 = nArray2--;
            nArray[v3] = sprhva.cfr_renamed_535(this.cfr_renamed_4[v3]);
            v2 = nArray2;
        }
        sprira sprira4 = this;
        int[][] nArray2 = new int[sprira4.cfr_renamed_3][sprira4.cfr_renamed_3];
        reference v5 = var3_5 = this.cfr_renamed_3 - true;
        while (v5 >= 0) {
            void var3_6;
            nArray2[var3_6][--var3_6] = 1;
            v5 = var3_6;
        }
        boolean bl2 = bl = false;
        while (bl2 < this.cfr_renamed_3) {
            int n;
            Object object;
            int n2;
            void var3_8;
            if (nArray[var3_8][var3_8] == 0) {
                n2 = 0;
                int n3 = object = var3_8 + true;
                while (n3 < this.cfr_renamed_3) {
                    if (nArray[object][var3_8] != 0) {
                        n2 = 1;
                        void v8 = var3_8;
                        sprira.cfr_renamed_1083(nArray, (int)v8, object);
                        sprira.cfr_renamed_1083(nArray2, (int)v8, object);
                        object = this.cfr_renamed_3;
                    }
                    n3 = ++object;
                }
                if (n2 == 0) {
                    throw new ArithmeticException(sprhql.cfr_renamed_9("jdSwN}\u0007lT%IjS%NkQ`UqNgK`\t"));
                }
            }
            n2 = nArray[var3_8][var3_8];
            sprira sprira5 = this;
            object = this.cfr_renamed_3.cfr_renamed_817(n2);
            sprira5.cfr_renamed_1084(nArray[var3_8], (int)object);
            sprira5.cfr_renamed_1084(nArray2[var3_8], (int)object);
            int n4 = n = 0;
            while (n4 < this.cfr_renamed_3) {
                if (n != var3_8 && (n2 = nArray[n][var3_8]) != 0) {
                    sprira sprira6 = this;
                    int[] nArray3 = sprira6.cfr_renamed_1081(nArray[var3_8], n2);
                    int[] nArray4 = sprira6.cfr_renamed_1081(nArray2[var3_8], n2);
                    sprira6.cfr_renamed_1082(nArray3, nArray[n]);
                    sprira6.cfr_renamed_1082(nArray4, nArray2[n]);
                }
                n4 = ++n;
            }
            bl2 = ++var3_8;
        }
        return new sprira(this.cfr_renamed_3, nArray2);
    }
}

