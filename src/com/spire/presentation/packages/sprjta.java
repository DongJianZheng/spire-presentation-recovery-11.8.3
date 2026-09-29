/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhva;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprnra;
import com.spire.presentation.packages.sprpoa;
import com.spire.presentation.packages.sprqap;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprudy;
import com.spire.presentation.packages.sprula;
import java.security.SecureRandom;

public class sprjta
extends sprnra {
    private int cfr_renamed_2;
    private int[][] cfr_renamed_4;

    public sprula cfr_renamed_1089(sprula arg0) {
        int n;
        if (!(arg0 instanceof sprsma)) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("FkSz_|\u0010gC.^aD.TkVg^kT._xU|\u0010Iv&\u0002'"));
        }
        sprjta sprjta2 = this;
        if (arg0.cfr_renamed_4 != sprjta2.cfr_renamed_0 + sprjta2.cfr_renamed_3) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("4\u00046\u0006,\tx\f1\u00125\u0000,\u00020"));
        }
        int[] nArray = ((sprsma)arg0).cfr_renamed_959();
        sprjta sprjta3 = this;
        int[] nArray2 = new int[sprjta3.cfr_renamed_3 + 31 >>> 5];
        int n2 = sprjta3.cfr_renamed_3 >> 5;
        int n3 = sprjta3.cfr_renamed_3 & 0x1F;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6;
            int n7 = nArray[n >> 5] >>> (n & 0x1F) & 1;
            int n8 = n2;
            if (n3 != 0) {
                n6 = 0;
                int n9 = n5 = 0;
                while (n9 < this.cfr_renamed_2 - 1) {
                    n6 = nArray[n8] >>> n3 | nArray[++n8] << 32 - n3;
                    int n10 = this.cfr_renamed_4[n][n5];
                    n7 ^= n10 & n6;
                    n9 = ++n5;
                }
                int n11 = n6 = nArray[n8] >>> n3;
                if (++n8 < nArray.length) {
                    n6 |= nArray[n8] << 32 - n3;
                }
                n7 ^= this.cfr_renamed_4[n][this.cfr_renamed_2 - 1] & n6;
            } else {
                int n12 = n6 = 0;
                while (n12 < this.cfr_renamed_2) {
                    int n13 = this.cfr_renamed_4[n][n6] & nArray[n8];
                    ++n8;
                    n7 ^= n13;
                    n12 = ++n6;
                }
            }
            n6 = 0;
            int n14 = n5 = 0;
            while (n14 < 32) {
                n6 ^= n7 & 1;
                n7 >>>= 1;
                n14 = ++n5;
            }
            if (n6 == 1) {
                int n15 = n >> 5;
                nArray2[n15] = nArray2[n15] | 1 << (n & 0x1F);
            }
            n4 = ++n;
        }
        return new sprsma(nArray2, this.cfr_renamed_3);
    }

    public sprnra cfr_renamed_1090() {
        int n;
        sprjta sprjta2 = this;
        int[][] nArray = new int[sprjta2.cfr_renamed_0][sprjta2.cfr_renamed_3 + 31 >>> 5];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_0) {
                int n5 = n3 >>> 5;
                int n6 = n3 & 0x1F;
                int n7 = this.cfr_renamed_4[n][n5] >>> n6 & 1;
                int n8 = n >>> 5;
                int n9 = n & 0x1F;
                if (n7 == 1) {
                    int[] nArray2 = nArray[n3];
                    int n10 = n8;
                    nArray2[n10] = nArray2[n10] | 1 << n9;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return new sprjta(this.cfr_renamed_3, nArray);
    }

    public double cfr_renamed_961() {
        int n;
        double d = 0.0;
        double d2 = 0.0;
        int n2 = this.cfr_renamed_0 & 0x1F;
        int n3 = n2 == 0 ? this.cfr_renamed_2 : this.cfr_renamed_2 - 1;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6;
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                n6 = this.cfr_renamed_4[n][n7];
                int n9 = n5 = 0;
                while (n9 < 32) {
                    int n10 = n6 >>> n5 & 1;
                    d += (double)n10;
                    d2 += 1.0;
                    n9 = ++n5;
                }
                n8 = ++n7;
            }
            n7 = this.cfr_renamed_4[n][this.cfr_renamed_2 - 1];
            int n11 = n6 = 0;
            while (n11 < n2) {
                n5 = n7 >>> n6 & 1;
                d += (double)n5;
                d2 += 1.0;
                n11 = ++n6;
            }
            n4 = ++n;
        }
        return d / d2;
    }

    public sprnra cfr_renamed_1091(sprkqa arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (nArray.length != this.cfr_renamed_3) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("bU`WzX.]gCcQzSf"));
        }
        int[][] nArrayArray = new int[this.cfr_renamed_3][];
        int n2 = n = this.cfr_renamed_3 - 1;
        while (n2 >= 0) {
            int n3 = n--;
            nArrayArray[n3] = sprhva.cfr_renamed_535(this.cfr_renamed_4[nArray[n3]]);
            n2 = n;
        }
        return new sprjta(this.cfr_renamed_3, nArrayArray);
    }

    public int[] cfr_renamed_1092(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    @Override
    public sprula cfr_renamed_881(sprula arg0) {
        int n;
        int n2;
        int n3;
        if (!(arg0 instanceof sprsma)) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("\u0017=\u0002,\u000e*A1\u0012x\u000f7\u0015x\u0005=\u00071\u000f=\u0005x\u000e.\u0004*A\u001f'pSq"));
        }
        if (arg0.cfr_renamed_4 != this.cfr_renamed_3) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("bU`WzX.]gCcQzSf"));
        }
        int[] nArray = ((sprsma)arg0).cfr_renamed_959();
        sprjta sprjta2 = this;
        int[] nArray2 = new int[sprjta2.cfr_renamed_2];
        int n4 = sprjta2.cfr_renamed_3 >> 5;
        int n5 = 1 << (this.cfr_renamed_3 & 0x1F);
        int n6 = 0;
        int n7 = n3 = 0;
        while (n7 < n4) {
            n2 = 1;
            do {
                if ((n = nArray[n3] & n2) != 0) {
                    int n8;
                    int n9 = n8 = 0;
                    while (n9 < this.cfr_renamed_2) {
                        int n10 = n8;
                        int n11 = nArray2[n10] ^ this.cfr_renamed_4[n6][n8];
                        nArray2[n10] = n11;
                        n9 = ++n8;
                    }
                }
                ++n6;
            } while ((n2 <<= 1) != 0);
            n7 = ++n3;
        }
        int n12 = n3 = 1;
        while (n12 != n5) {
            n2 = nArray[n4] & n3;
            if (n2 != 0) {
                int n13 = n = 0;
                while (n13 < this.cfr_renamed_2) {
                    int n14 = n;
                    int n15 = nArray2[n14] ^ this.cfr_renamed_4[n6][n];
                    nArray2[n14] = n15;
                    n13 = ++n;
                }
            }
            ++n6;
            n12 = n3 << 1;
        }
        return new sprsma(nArray2, this.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjta(int n, int[][] nArray) {
        int n2;
        void arg1;
        void arg0;
        if (nArray[0].length != arg0 + 31 >> 5) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("\u0011\u000f,A9\u0013*\u0000!A<\u000e=\u0012x\u000f7\u0015x\f9\u0015;\tx\u00061\u0017=\u000fx\u000f-\f:\u0004*A7\u0007x\u00027\r-\f6\u0012v"));
        }
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_3 = ((void)arg1).length;
        this.cfr_renamed_2 = ((void)arg1[0]).length;
        int n3 = arg0 & 0x1F;
        int n4 = n3 == 0 ? -1 : (1 << n3) - 1;
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_3) {
            void v1 = arg1[n2];
            int n6 = this.cfr_renamed_2 - 1;
            v1[n6] = v1[n6] & n4;
            n5 = ++n2;
        }
        this.cfr_renamed_4 = arg1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_1093(int[][] nArray, int n, int n2) {
        void arg2;
        int[][] arg0;
        int[] nArray2 = nArray[n];
        nArray[arg1] = arg0[arg2];
        arg0[arg2] = nArray2;
    }

    public sprjta cfr_renamed_945() {
        int n;
        sprjta sprjta2 = this;
        if (sprjta2.cfr_renamed_0 <= sprjta2.cfr_renamed_3) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("k]~Dw\u0010}El]oD|Yv"));
        }
        sprjta sprjta3 = this;
        int n2 = sprjta3.cfr_renamed_3 + 31 >> 5;
        int[][] nArray = new int[sprjta3.cfr_renamed_3][n2];
        int n3 = (1 << (this.cfr_renamed_3 & 0x1F)) - 1;
        if (n3 == 0) {
            n3 = -1;
        }
        int n4 = n = this.cfr_renamed_3 - 1;
        while (n4 >= 0) {
            int n5 = n;
            System.arraycopy(this.cfr_renamed_4[n5], 0, nArray[n], 0, n2);
            int[] nArray2 = nArray[n5];
            int n6 = n2 - 1;
            nArray2[n6] = nArray2[n6] & n3;
            n4 = --n;
        }
        return new sprjta(this.cfr_renamed_3, nArray);
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1094(int n, SecureRandom secureRandom) {
        int n2;
        void arg1;
        void arg0;
        this.cfr_renamed_0 = this.cfr_renamed_3 = n;
        this.cfr_renamed_2 = n + 31 >>> 5;
        this.cfr_renamed_4 = new int[this.cfr_renamed_3][this.cfr_renamed_2];
        sprjta sprjta2 = new sprjta((int)arg0, 'L', (SecureRandom)arg1);
        sprjta sprjta3 = new sprjta((int)arg0, 'U', (SecureRandom)arg1);
        sprjta sprjta4 = (sprjta)sprjta2.cfr_renamed_882(sprjta3);
        int[] nArray = new sprkqa((int)arg0, (SecureRandom)arg1).cfr_renamed_876();
        int n3 = n2 = 0;
        while (n3 < arg0) {
            System.arraycopy(sprjta4.cfr_renamed_4[n2], 0, this.cfr_renamed_4[nArray[++n2]], 0, this.cfr_renamed_2);
            n3 = n2;
        }
    }

    public int[][] cfr_renamed_1095() {
        return this.cfr_renamed_4;
    }

    public sprjta cfr_renamed_1096() {
        int n;
        sprjta sprjta2 = this;
        sprjta sprjta3 = this;
        int n2 = sprjta2.cfr_renamed_0 + sprjta3.cfr_renamed_3;
        sprjta sprjta4 = new sprjta(this.cfr_renamed_3, n2);
        int n3 = sprjta2.cfr_renamed_3 - 1 + this.cfr_renamed_0;
        int n4 = n = sprjta3.cfr_renamed_3 - 1;
        while (n4 >= 0) {
            sprjta sprjta5 = sprjta4;
            System.arraycopy(this.cfr_renamed_4[n], 0, sprjta5.cfr_renamed_4[n], 0, this.cfr_renamed_2);
            int[] nArray = sprjta5.cfr_renamed_4[n];
            int n5 = n3 >> 5;
            nArray[n5] = nArray[n5] | 1 << (n3 & 0x1F);
            --n3;
            n4 = --n;
        }
        return sprjta4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjta(int n, int n2) {
        void arg1;
        void arg0;
        if (n2 <= 0 || arg0 <= 0) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("\u00121\u001b=A7\u0007x\f9\u0015*\b A1\u0012x\u000f7\u000fu\u00117\u00121\u00151\u0017="));
        }
        this.cfr_renamed_1097((int)arg0, (int)arg1);
    }

    public boolean equals(Object arg0) {
        int n;
        if (!(arg0 instanceof sprjta)) {
            return false;
        }
        sprjta sprjta2 = (sprjta)arg0;
        if (this.cfr_renamed_3 != sprjta2.cfr_renamed_3 || this.cfr_renamed_0 != sprjta2.cfr_renamed_0 || this.cfr_renamed_2 != sprjta2.cfr_renamed_2) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            if (!sprhva.cfr_renamed_874(this.cfr_renamed_4[n], sprjta2.cfr_renamed_4[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    @Override
    public sprnra cfr_renamed_882(sprnra arg0) {
        int n;
        if (!(arg0 instanceof sprjta)) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("]oD|Yv\u0010gC.^aD.TkVg^kT._xU|\u0010Iv&\u0002'"));
        }
        if (arg0.cfr_renamed_3 != this.cfr_renamed_0) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("4\u00046\u0006,\tx\f1\u00125\u0000,\u00020"));
        }
        sprjta sprjta2 = (sprjta)arg0;
        sprjta sprjta3 = new sprjta(this.cfr_renamed_3, arg0.cfr_renamed_0);
        int n2 = this.cfr_renamed_0 & 0x1F;
        int n3 = n2 == 0 ? this.cfr_renamed_2 : this.cfr_renamed_2 - 1;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = 0;
            int n10 = n8 = 0;
            while (n10 < n3) {
                n7 = this.cfr_renamed_4[n][n8];
                int n11 = n6 = 0;
                while (n11 < 32) {
                    n5 = n7 & 1 << n6;
                    if (n5 != 0) {
                        int n12;
                        int n13 = n12 = 0;
                        while (n13 < sprjta2.cfr_renamed_2) {
                            int[] nArray = sprjta3.cfr_renamed_4[n];
                            int n14 = n12;
                            int n15 = nArray[n14] ^ sprjta2.cfr_renamed_4[n9][n12];
                            nArray[n14] = n15;
                            n13 = ++n12;
                        }
                    }
                    ++n9;
                    n11 = ++n6;
                }
                n10 = ++n8;
            }
            n8 = this.cfr_renamed_4[n][this.cfr_renamed_2 - 1];
            int n16 = n7 = 0;
            while (n16 < n2) {
                n6 = n8 & 1 << n7;
                if (n6 != 0) {
                    int n17 = n5 = 0;
                    while (n17 < sprjta2.cfr_renamed_2) {
                        int[] nArray = sprjta3.cfr_renamed_4[n];
                        int n18 = n5;
                        int n19 = nArray[n18] ^ sprjta2.cfr_renamed_4[n9][n5];
                        nArray[n18] = n19;
                        n17 = ++n5;
                    }
                }
                ++n9;
                n16 = ++n7;
            }
            n4 = ++n;
        }
        return sprjta3;
    }

    @Override
    public String toString() {
        int n;
        int n2 = this.cfr_renamed_0 & 0x1F;
        int n3 = n2 == 0 ? this.cfr_renamed_2 : this.cfr_renamed_2 - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6;
            stringBuffer.append(n + ": ");
            int n7 = 0;
            int n8 = n7;
            while (n8 < n3) {
                n6 = this.cfr_renamed_4[n][n7];
                int n9 = n5 = 0;
                while (n9 < 32) {
                    if ((n6 >>> n5 & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                    n9 = ++n5;
                }
                stringBuffer.append(' ');
                n8 = ++n7;
            }
            n7 = this.cfr_renamed_4[n][this.cfr_renamed_2 - 1];
            int n10 = n6 = 0;
            while (n10 < n2) {
                n5 = n7 >>> n6 & 1;
                StringBuffer stringBuffer2 = stringBuffer;
                if (n5 == 0) {
                    stringBuffer2.append('0');
                } else {
                    stringBuffer2.append('1');
                }
                n10 = ++n6;
            }
            stringBuffer.append('\n');
            n4 = ++n;
        }
        return stringBuffer.toString();
    }

    public sprjta(int arg0, char arg1) {
        this(arg0, arg1, new SecureRandom());
    }

    @Override
    public sprnra cfr_renamed_879(sprkqa arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (nArray.length != this.cfr_renamed_0) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("bU`WzX.]gCcQzSf"));
        }
        sprjta sprjta2 = this;
        sprjta sprjta3 = new sprjta(sprjta2.cfr_renamed_3, sprjta2.cfr_renamed_0);
        int n2 = n = this.cfr_renamed_0 - 1;
        while (n2 >= 0) {
            int n3 = n >>> 5;
            int n4 = n & 0x1F;
            int n5 = nArray[n] >>> 5;
            int n6 = nArray[n] & 0x1F;
            int n7 = this.cfr_renamed_3 - 1;
            while (n7 >= 0) {
                int n8;
                int[] nArray2 = sprjta3.cfr_renamed_4[n8];
                int n9 = n3;
                int n10 = nArray2[n9] | (this.cfr_renamed_4[n8][n5] >>> n6 & 1) << n4;
                nArray2[n9] = n10;
                n7 = --n8;
            }
            n2 = --n;
        }
        return sprjta3;
    }

    public sprjta cfr_renamed_946() {
        int n;
        sprjta sprjta2 = this;
        if (sprjta2.cfr_renamed_0 <= sprjta2.cfr_renamed_3) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("=\f(\u0015!A+\u0014:\f9\u0015*\b "));
        }
        sprjta sprjta3 = this;
        int n2 = sprjta3.cfr_renamed_3 >> 5;
        int n3 = sprjta3.cfr_renamed_3 & 0x1F;
        sprjta sprjta4 = this;
        sprjta sprjta5 = new sprjta(sprjta4.cfr_renamed_3, sprjta4.cfr_renamed_0 - this.cfr_renamed_3);
        int n4 = n = sprjta3.cfr_renamed_3 - 1;
        while (n4 >= 0) {
            if (n3 != 0) {
                int n5;
                int n6 = n2;
                int n7 = n5 = 0;
                while (n7 < sprjta5.cfr_renamed_2 - 1) {
                    sprjta5.cfr_renamed_4[n][n5++] = this.cfr_renamed_4[n][n6] >>> n3 | this.cfr_renamed_4[n][++n6] << 32 - n3;
                    n7 = n5;
                }
                int n8 = sprjta5.cfr_renamed_4[n][sprjta5.cfr_renamed_2 - 1] = this.cfr_renamed_4[n][n6] >>> n3;
                if (++n6 < this.cfr_renamed_2) {
                    int[] nArray = sprjta5.cfr_renamed_4[n];
                    int n9 = sprjta5.cfr_renamed_2 - 1;
                    nArray[n9] = nArray[n9] | this.cfr_renamed_4[n][n6] << 32 - n3;
                }
            } else {
                System.arraycopy(this.cfr_renamed_4[n], n2, sprjta5.cfr_renamed_4[n], 0, sprjta5.cfr_renamed_2);
            }
            n4 = --n;
        }
        return sprjta5;
    }

    private static /* synthetic */ void cfr_renamed_1098(int[] arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = arg1.length - 1;
        while (n2 >= arg2) {
            int n3 = n;
            int n4 = arg0[n3] ^ arg1[n];
            arg1[n3] = n4;
            n2 = --n;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprjta(int n, char c, SecureRandom secureRandom) {
        void arg1;
        if (n <= 0) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("]YtU._h\u0010cQzBgH.Y}\u0010`_`\u001d~_}YzYxU "));
        }
        switch (arg1) {
            case 90: {
                void arg0;
                void v0 = arg0;
                this.cfr_renamed_1097((int)v0, (int)v0);
                return;
            }
            case 73: {
                void arg0;
                this.cfr_renamed_1099((int)arg0);
                return;
            }
            case 76: {
                void arg2;
                void arg0;
                this.cfr_renamed_1100((int)arg0, (SecureRandom)arg2);
                return;
            }
            case 85: {
                void arg2;
                void arg0;
                this.cfr_renamed_1101((int)arg0, (SecureRandom)arg2);
                return;
            }
            case 82: {
                void arg2;
                void arg0;
                this.cfr_renamed_1094((int)arg0, (SecureRandom)arg2);
                return;
            }
        }
        throw new ArithmeticException(sprudy.cfr_renamed_9("46\n6\u000e/\u000fx\f9\u0015*\b A,\u0018(\u0004v"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1101(int n, SecureRandom secureRandom) {
        int n2;
        void arg0;
        this.cfr_renamed_0 = this.cfr_renamed_3 = n;
        this.cfr_renamed_2 = n + 31 >>> 5;
        this.cfr_renamed_4 = new int[this.cfr_renamed_3][this.cfr_renamed_2];
        int n3 = arg0 & 0x1F;
        int n4 = n3 == 0 ? -1 : (1 << n3) - 1;
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_3) {
            void arg1;
            int n6;
            int n7;
            int n8 = n2 >>> 5;
            int n9 = n7 = n2 & 0x1F;
            n7 = 1 << n7;
            int n10 = n6 = 0;
            while (n10 < n8) {
                this.cfr_renamed_4[n2][n6++] = 0;
                n10 = n6;
            }
            this.cfr_renamed_4[n2][n8] = arg1.nextInt() << n9 | n7;
            int n11 = n6 = n8 + 1;
            while (n11 < this.cfr_renamed_2) {
                this.cfr_renamed_4[n2][n6++] = arg1.nextInt();
                n11 = n6;
            }
            int[] nArray = this.cfr_renamed_4[n2];
            int n12 = this.cfr_renamed_2 - 1;
            nArray[n12] = nArray[n12] & n4;
            n5 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1100(int n, SecureRandom secureRandom) {
        int n2;
        this.cfr_renamed_0 = this.cfr_renamed_3 = n;
        this.cfr_renamed_2 = n + 31 >>> 5;
        this.cfr_renamed_4 = new int[this.cfr_renamed_3][this.cfr_renamed_2];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_3) {
            void arg1;
            int n4;
            int n5 = n2 >>> 5;
            int n6 = n2 & 0x1F;
            int n7 = 31 - n6;
            n6 = 1 << n6;
            int n8 = n4 = 0;
            while (n8 < n5) {
                this.cfr_renamed_4[n2][n4++] = arg1.nextInt();
                n8 = n4;
            }
            this.cfr_renamed_4[n2][n5] = arg1.nextInt() >>> n7 | n6;
            int n9 = n4 = n5 + 1;
            while (n9 < this.cfr_renamed_2) {
                this.cfr_renamed_4[n2][n4++] = 0;
                n9 = n4;
            }
            n3 = ++n2;
        }
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_2) {
                if (this.cfr_renamed_4[n][n3] != 0) {
                    return false;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ void cfr_renamed_1097(int n, int n2) {
        int n3;
        this.cfr_renamed_3 = n;
        this.cfr_renamed_0 = n2;
        this.cfr_renamed_2 = n2 + 31 >>> 5;
        this.cfr_renamed_4 = new int[this.cfr_renamed_3][this.cfr_renamed_2];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_2) {
                this.cfr_renamed_4[n3][n5++] = 0;
                n6 = n5;
            }
            n4 = ++n3;
        }
    }

    public sprula cfr_renamed_1102(sprula arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        if (!(arg0 instanceof sprsma)) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("FkSz_|\u0010gC.^aD.TkVg^kT._xU|\u0010Iv&\u0002'"));
        }
        if (arg0.cfr_renamed_4 != this.cfr_renamed_3) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("4\u00046\u0006,\tx\f1\u00125\u0000,\u00020"));
        }
        int[] nArray = ((sprsma)arg0).cfr_renamed_959();
        sprjta sprjta2 = this;
        int[] nArray2 = new int[this.cfr_renamed_3 + sprjta2.cfr_renamed_0 + 31 >>> 5];
        int n6 = sprjta2.cfr_renamed_3 >>> 5;
        int n7 = 0;
        int n8 = n5 = 0;
        while (n8 < n6) {
            n4 = 1;
            do {
                if ((n3 = nArray[n5] & n4) != 0) {
                    int n9 = n2 = 0;
                    while (n9 < this.cfr_renamed_2) {
                        int n10 = n2;
                        int n11 = nArray2[n10] ^ this.cfr_renamed_4[n7][n2];
                        nArray2[n10] = n11;
                        n9 = ++n2;
                    }
                    sprjta sprjta3 = this;
                    n2 = sprjta3.cfr_renamed_0 + n7 >>> 5;
                    n = sprjta3.cfr_renamed_0 + n7 & 0x1F;
                    int n12 = n2;
                    nArray2[n12] = nArray2[n12] | 1 << n;
                }
                ++n7;
            } while ((n4 <<= 1) != 0);
            n8 = ++n5;
        }
        n5 = 1 << (this.cfr_renamed_3 & 0x1F);
        int n13 = n4 = 1;
        while (n13 != n5) {
            n3 = nArray[n6] & n4;
            if (n3 != 0) {
                int n14 = n2 = 0;
                while (n14 < this.cfr_renamed_2) {
                    int n15 = n2;
                    int n16 = nArray2[n15] ^ this.cfr_renamed_4[n7][n2];
                    nArray2[n15] = n16;
                    n14 = ++n2;
                }
                sprjta sprjta4 = this;
                n2 = sprjta4.cfr_renamed_0 + n7 >>> 5;
                n = sprjta4.cfr_renamed_0 + n7 & 0x1F;
                int n17 = n2;
                nArray2[n17] = nArray2[n17] | 1 << n;
            }
            ++n7;
            n13 = n4 << 1;
        }
        sprjta sprjta5 = this;
        return new sprsma(nArray2, sprjta5.cfr_renamed_3 + sprjta5.cfr_renamed_0);
    }

    @Override
    public byte[] cfr_renamed_91() {
        int n;
        sprjta sprjta2 = this;
        int n2 = sprjta2.cfr_renamed_0 + 7 >>> 3;
        sprjta sprjta3 = this;
        n2 *= sprjta3.cfr_renamed_3;
        byte[] byArray = new byte[n2 += 8];
        sprpoa.cfr_renamed_877(sprjta2.cfr_renamed_3, byArray, 0);
        sprpoa.cfr_renamed_877(sprjta3.cfr_renamed_0, byArray, 4);
        int n3 = sprjta2.cfr_renamed_0 >>> 5;
        int n4 = sprjta2.cfr_renamed_0 & 0x1F;
        int n5 = 8;
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_3) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                int n9 = this.cfr_renamed_4[n][n7];
                sprpoa.cfr_renamed_877(n9, byArray, n5);
                n5 += 4;
                n8 = ++n7;
            }
            int n10 = n7 = 0;
            while (n10 < n4) {
                int n11 = n5++;
                byte by = (byte)(this.cfr_renamed_4[n][n3] >>> n7 & 0xFF);
                byArray[n11] = by;
                n10 = n7 += 8;
            }
            n6 = ++n;
        }
        return byArray;
    }

    @Override
    public sprnra cfr_renamed_875() {
        int n;
        int n2;
        int n3;
        int n4;
        sprjta sprjta2 = this;
        if (sprjta2.cfr_renamed_3 != sprjta2.cfr_renamed_0) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("CQzBgH.Y}\u0010`_z\u0010g^xU|DgRbU "));
        }
        sprjta sprjta3 = this;
        int[][] nArray = new int[sprjta3.cfr_renamed_3][sprjta3.cfr_renamed_2];
        int n5 = n4 = this.cfr_renamed_3 - 1;
        while (n5 >= 0) {
            int n6 = n4--;
            nArray[n6] = sprhva.cfr_renamed_535(this.cfr_renamed_4[n6]);
            n5 = n4;
        }
        sprjta sprjta4 = this;
        int[][] nArray2 = new int[sprjta4.cfr_renamed_3][sprjta4.cfr_renamed_2];
        int n7 = n3 = this.cfr_renamed_3 - 1;
        while (n7 >= 0) {
            n2 = n3 >> 5;
            n = n3 & 0x1F;
            int[] nArray3 = nArray2[n3];
            nArray3[n2] = 1 << n;
            n7 = --n3;
        }
        int n8 = n3 = 0;
        while (n8 < this.cfr_renamed_3) {
            int n9;
            n2 = n3 >> 5;
            n = 1 << (n3 & 0x1F);
            if ((nArray[n3][n2] & n) == 0) {
                n9 = 0;
                int n10 = n3 + 1;
                while (n10 < this.cfr_renamed_3) {
                    int n11;
                    if ((nArray[n11][n2] & n) != 0) {
                        n9 = 1;
                        int n12 = n3;
                        sprjta.cfr_renamed_1093(nArray, n12, n11);
                        sprjta.cfr_renamed_1093(nArray2, n12, n11);
                        n11 = this.cfr_renamed_3;
                    }
                    n10 = ++n11;
                }
                if (n9 == 0) {
                    throw new ArithmeticException(sprudy.cfr_renamed_9("\u0015\u0000,\u00131\u0019x\b+A6\u000e,A1\u000f.\u0004*\u00151\u00034\u0004v"));
                }
            }
            int n13 = this.cfr_renamed_3 - 1;
            while (n13 >= 0) {
                if (n9 != n3 && (nArray[n9][n2] & n) != 0) {
                    int n14 = n3;
                    sprjta.cfr_renamed_1098(nArray[n14], nArray[n9], n2);
                    sprjta.cfr_renamed_1098(nArray2[n14], nArray2[n9], 0);
                }
                n13 = --n9;
            }
            n8 = ++n3;
        }
        return new sprjta(this.cfr_renamed_0, nArray2);
    }

    private /* synthetic */ void cfr_renamed_1099(int n) {
        int n2;
        int n3;
        this.cfr_renamed_0 = this.cfr_renamed_3 = n;
        this.cfr_renamed_2 = n + 31 >>> 5;
        this.cfr_renamed_4 = new int[this.cfr_renamed_3][this.cfr_renamed_2];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5 = n2 = 0;
            while (n5 < this.cfr_renamed_2) {
                this.cfr_renamed_4[n3][n2++] = 0;
                n5 = n2;
            }
            n4 = ++n3;
        }
        int n6 = n3 = 0;
        while (n6 < this.cfr_renamed_3) {
            n2 = n3 & 0x1F;
            int[] nArray = this.cfr_renamed_4[n3];
            int n7 = n3 >>> 5;
            nArray[n7] = 1 << n2;
            n6 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprjta(sprjta sprjta2) {
        int n;
        void arg0;
        sprjta sprjta3 = this;
        void v1 = arg0;
        this.cfr_renamed_0 = arg0.cfr_renamed_883();
        this.cfr_renamed_3 = v1.cfr_renamed_884();
        sprjta3.cfr_renamed_2 = v1.cfr_renamed_2;
        sprjta3.cfr_renamed_4 = new int[sprjta2.cfr_renamed_4.length][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprhva.cfr_renamed_535(arg0.cfr_renamed_4[n3]);
            n2 = n;
        }
    }

    public sprjta cfr_renamed_1103() {
        int n;
        sprjta sprjta2 = this;
        sprjta sprjta3 = new sprjta(sprjta2.cfr_renamed_3, sprjta2.cfr_renamed_3 + this.cfr_renamed_0);
        sprjta sprjta4 = this;
        int n2 = sprjta4.cfr_renamed_3 >> 5;
        int n3 = sprjta4.cfr_renamed_3 & 0x1F;
        int n4 = n = sprjta4.cfr_renamed_3 - 1;
        while (n4 >= 0) {
            int[] nArray = sprjta3.cfr_renamed_4[n];
            int n5 = n >> 5;
            nArray[n5] = nArray[n5] | 1 << (n & 0x1F);
            if (n3 != 0) {
                int n6;
                int n7 = n2;
                int n8 = n6 = 0;
                while (n8 < this.cfr_renamed_2 - 1) {
                    int n9 = this.cfr_renamed_4[n][n6];
                    int[] nArray2 = sprjta3.cfr_renamed_4[n];
                    int n10 = n7++;
                    nArray2[n10] = nArray2[n10] | n9 << n3;
                    int[] nArray3 = sprjta3.cfr_renamed_4[n];
                    int n11 = n7;
                    nArray3[n11] = nArray3[n11] | n9 >>> 32 - n3;
                    n8 = ++n6;
                }
                n6 = this.cfr_renamed_4[n][this.cfr_renamed_2 - 1];
                int[] nArray4 = sprjta3.cfr_renamed_4[n];
                int n12 = n7++;
                nArray4[n12] = nArray4[n12] | n6 << n3;
                if (n7 < sprjta3.cfr_renamed_2) {
                    int[] nArray5 = sprjta3.cfr_renamed_4[n];
                    int n13 = n7;
                    nArray5[n13] = nArray5[n13] | n6 >>> 32 - n3;
                }
            } else {
                System.arraycopy(this.cfr_renamed_4[n], 0, sprjta3.cfr_renamed_4[n], n2, this.cfr_renamed_2);
            }
            n4 = --n;
        }
        return sprjta3;
    }

    public int hashCode() {
        int n;
        int n2 = (this.cfr_renamed_3 * 31 + this.cfr_renamed_0) * 31 + this.cfr_renamed_2;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int[] nArray = this.cfr_renamed_4[n];
            n2 = n2 * 31 + nArray.hashCode();
            n3 = ++n;
        }
        return n2;
    }

    public static sprjta[] cfr_renamed_1104(int arg0, SecureRandom arg1) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        sprjta[] sprjtaArray = new sprjta[2];
        int n9 = arg0 + 31 >> 5;
        sprjta sprjta2 = new sprjta(arg0, 'L', arg1);
        sprjta sprjta3 = new sprjta(arg0, 'U', arg1);
        sprjta sprjta4 = (sprjta)sprjta2.cfr_renamed_882(sprjta3);
        sprkqa sprkqa2 = new sprkqa(arg0, arg1);
        int[] nArray = sprkqa2.cfr_renamed_876();
        int[][] nArray2 = new int[arg0][n9];
        int n10 = n8 = 0;
        while (n10 < arg0) {
            int[] nArray3 = sprjta4.cfr_renamed_4[nArray[n8]];
            int[] nArray4 = nArray2[n8];
            System.arraycopy(nArray3, 0, nArray4, 0, n9);
            n10 = ++n8;
        }
        sprjtaArray[0] = new sprjta(arg0, nArray2);
        sprjta sprjta5 = new sprjta(arg0, 'I');
        int n11 = n7 = 0;
        while (n11 < arg0) {
            n6 = n7 & 0x1F;
            n5 = n7 >>> 5;
            n4 = 1 << n6;
            int n12 = n7 + 1;
            while (n12 < arg0) {
                n2 = sprjta2.cfr_renamed_4[n3][n5] & n4;
                if (n2 != 0) {
                    int n13 = n = 0;
                    while (n13 <= n5) {
                        int[] nArray5 = sprjta5.cfr_renamed_4[n3];
                        int n14 = n;
                        int n15 = nArray5[n14] ^ sprjta5.cfr_renamed_4[n7][n];
                        nArray5[n14] = n15;
                        n13 = ++n;
                    }
                }
                n12 = ++n3;
            }
            n11 = ++n7;
        }
        sprjta sprjta6 = new sprjta(arg0, 'I');
        int n16 = n6 = arg0 - 1;
        while (n16 >= 0) {
            n5 = n6 & 0x1F;
            n4 = n6 >>> 5;
            n3 = 1 << n5;
            int n17 = n6 - 1;
            while (n17 >= 0) {
                n = sprjta3.cfr_renamed_4[n2][n4] & n3;
                if (n != 0) {
                    int n18 = n4;
                    while (n18 < n9) {
                        int n19;
                        int[] nArray6 = sprjta6.cfr_renamed_4[n2];
                        int n20 = n19;
                        int n21 = nArray6[n20] ^ sprjta6.cfr_renamed_4[n6][n19];
                        nArray6[n20] = n21;
                        n18 = ++n19;
                    }
                }
                n17 = --n2;
            }
            n16 = --n6;
        }
        sprjtaArray[1] = (sprjta)sprjta6.cfr_renamed_882(sprjta5.cfr_renamed_879(sprkqa2));
        return sprjtaArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprjta(byte[] byArray) {
        int n;
        void arg0;
        if (byArray.length < 9) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("iYxU`\u0010oB|Qw\u0010gC.^aD.Q`\u0010k^m_jUj\u0010cQzBgH._xU|\u0010Iv&\u0002'"));
        }
        sprjta sprjta2 = this;
        sprjta sprjta3 = this;
        sprjta3.cfr_renamed_3 = sprpoa.cfr_renamed_871((byte[])arg0, 0);
        sprjta3.cfr_renamed_0 = sprpoa.cfr_renamed_871((byte[])arg0, 4);
        int n2 = (sprjta2.cfr_renamed_0 + 7 >>> 3) * this.cfr_renamed_3;
        if (sprjta2.cfr_renamed_3 <= 0 || n2 != ((void)arg0).length - 8) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("?\b.\u00046A9\u0013*\u0000!A1\u0012x\u000f7\u0015x\u00006A=\u000f;\u000e<\u0004<A5\u0000,\u00131\u0019x\u000e.\u0004*A\u001f'pSq"));
        }
        sprjta sprjta4 = this;
        sprjta4.cfr_renamed_2 = sprjta4.cfr_renamed_0 + 31 >>> 5;
        sprjta4.cfr_renamed_4 = new int[sprjta4.cfr_renamed_3][this.cfr_renamed_2];
        sprjta sprjta5 = this;
        int n3 = sprjta5.cfr_renamed_0 >> 5;
        int n4 = sprjta5.cfr_renamed_0 & 0x1F;
        int n5 = 8;
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_3) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                this.cfr_renamed_4[n][n7++] = sprpoa.cfr_renamed_871((byte[])arg0, n5);
                n5 += 4;
                n8 = n7;
            }
            int n9 = n7 = 0;
            while (n9 < n4) {
                int[] nArray = this.cfr_renamed_4[n];
                int n10 = n3;
                int n11 = arg0[n5] & 0xFF;
                ++n5;
                int n12 = nArray[n10] ^ n11 << n7;
                nArray[n10] = n12;
                n9 = n7 += 8;
            }
            n6 = ++n;
        }
    }

    @Override
    public sprula cfr_renamed_880(sprula arg0) {
        int n;
        if (!(arg0 instanceof sprsma)) {
            throw new ArithmeticException(sprqap.cfr_renamed_9("FkSz_|\u0010gC.^aD.TkVg^kT._xU|\u0010Iv&\u0002'"));
        }
        if (arg0.cfr_renamed_4 != this.cfr_renamed_0) {
            throw new ArithmeticException(sprudy.cfr_renamed_9("4\u00046\u0006,\tx\f1\u00125\u0000,\u00020"));
        }
        int[] nArray = ((sprsma)arg0).cfr_renamed_959();
        int[] nArray2 = new int[this.cfr_renamed_3 + 31 >>> 5];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4;
            int n5 = 0;
            int n6 = n4 = 0;
            while (n6 < this.cfr_renamed_2) {
                int n7 = this.cfr_renamed_4[n][n4];
                int n8 = nArray[n4];
                n5 ^= n7 & n8;
                n6 = ++n4;
            }
            n4 = 0;
            int n9 = n3 = 0;
            while (n9 < 32) {
                int n10 = n5 >>> n3;
                n4 ^= n10 & 1;
                n9 = ++n3;
            }
            if (n4 == 1) {
                int n11 = n >>> 5;
                nArray2[n11] = nArray2[n11] | 1 << (n & 0x1F);
            }
            n2 = ++n;
        }
        return new sprsma(nArray2, this.cfr_renamed_3);
    }
}

