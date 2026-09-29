/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhua;
import com.spire.presentation.packages.sprkyca;
import com.spire.presentation.packages.sprnma;
import com.spire.presentation.packages.sprqte;
import com.spire.presentation.packages.sprrma;
import com.spire.presentation.packages.sprsta;
import com.spire.presentation.packages.spryoa;
import com.spire.presentation.packages.spryua;
import com.spire.presentation.packages.sprzma;
import java.security.SecureRandom;
import java.util.Vector;

public class sprwla
extends sprrma {
    private static final int cfr_renamed_91 = 64;
    private int cfr_renamed_0;
    private int cfr_renamed_2;
    public int[][] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_1019(sprrma arg0) {
        spryua spryua2;
        int n;
        if (this.cfr_renamed_1 != arg0.cfr_renamed_1) {
            throw new IllegalArgumentException(sprkyca.cfr_renamed_9("yK\fcxd[aZ#]bS}Ky[NqOslJ\u007fWu\u0004-|<\u001ee_~\u001el\u001eiWkXhLhPy\u001ei[jLh[-_cZ-JeK~\u001en_cPbJ-\\h\u001enQ{[\u007fJhZ-Jb\u001f"));
        }
        sprhua[] sprhuaArray = new sprhua[this.cfr_renamed_1];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            sprhuaArray[n++] = new sprhua(this.cfr_renamed_1);
            n2 = n;
        }
        while ((spryua2 = arg0.cfr_renamed_1020((sprhua)this.cfr_renamed_4)).cfr_renamed_805()) {
        }
        spryoa[] spryoaArray = new spryoa[this.cfr_renamed_1];
        spryoa[] spryoaArray2 = spryoaArray;
        spryoaArray[0] = (spryua)spryua2.clone();
        int n3 = n = 1;
        while (n3 < this.cfr_renamed_1) {
            spryoaArray2[++n] = ((spryua)spryoaArray2[n - 1]).cfr_renamed_1048();
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_1) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_1) {
                if (((spryua)spryoaArray2[n]).cfr_renamed_1012(n5)) {
                    sprhuaArray[this.cfr_renamed_1 - n5 - 1].cfr_renamed_949(this.cfr_renamed_1 - n - 1);
                }
                n6 = ++n5;
            }
            n4 = ++n;
        }
        sprwla sprwla2 = this;
        sprwla2.cfr_renamed_3.addElement(arg0);
        sprwla2.cfr_renamed_2.addElement(sprhuaArray);
        sprrma sprrma2 = arg0;
        sprrma2.cfr_renamed_3.addElement(this);
        sprrma2.cfr_renamed_2.addElement(this.cfr_renamed_1023(sprhuaArray));
    }

    private /* synthetic */ void cfr_renamed_1066() throws RuntimeException {
        int n;
        if ((this.cfr_renamed_1 & 7) == 0) {
            throw new RuntimeException(sprqte.cfr_renamed_9("\u001dZ,\u0012,J=W'A ]'\u0012-W.@,Wi[:\u0012-[?[:[+^,\u0012+Ki\nh"));
        }
        int n2 = 0;
        int n3 = 0;
        this.cfr_renamed_4 = 1;
        int n4 = n = 0;
        while (n4 != 1) {
            sprwla sprwla2 = this;
            n2 = sprwla2.cfr_renamed_4 * sprwla2.cfr_renamed_1 + 1;
            if (sprzma.cfr_renamed_914(n2)) {
                n3 = sprzma.cfr_renamed_929(2, n2);
                sprwla sprwla3 = this;
                n = sprzma.cfr_renamed_830(sprwla3.cfr_renamed_4 * sprwla3.cfr_renamed_1 / n3, this.cfr_renamed_1);
            }
            ++this.cfr_renamed_4;
            n4 = n;
        }
        sprwla sprwla4 = this;
        --sprwla4.cfr_renamed_4;
        if (sprwla4.cfr_renamed_4 == 1 && sprzma.cfr_renamed_914(n2 = (this.cfr_renamed_1 << 1) + 1) && (n = sprzma.cfr_renamed_830((this.cfr_renamed_1 << 1) / (n3 = sprzma.cfr_renamed_929(2, n2)), this.cfr_renamed_1)) == 1) {
            ++this.cfr_renamed_4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void cfr_renamed_1067() {
        int n;
        int n2;
        int n3;
        if ((this.cfr_renamed_4 & 7) == 0) throw new RuntimeException(sprqte.cfr_renamed_9("+[:Z,@i\\<@iT<W;\u0012\u000eS<A:A*Z,\u0012\u0007];_(^+S:W'\u0012 _9^,_,\\=[,@="));
        sprwla sprwla2 = this;
        int n4 = this.cfr_renamed_4 * sprwla2.cfr_renamed_1 + 1;
        int[] nArray = new int[n4];
        if (sprwla2.cfr_renamed_4 == 1) {
            n3 = 1;
        } else if (this.cfr_renamed_4 == 2) {
            n3 = n4 - 1;
        } else {
            sprwla sprwla3 = this;
            n3 = sprwla3.cfr_renamed_1068(sprwla3.cfr_renamed_4, n4);
        }
        int n5 = 1;
        int n6 = n2 = 0;
        while (n6 < this.cfr_renamed_4) {
            int n7 = n5;
            int n8 = n = 0;
            while (n8 < this.cfr_renamed_1) {
                int n9 = n7;
                nArray[n9] = n;
                n7 = (n9 << 1) % n4;
                if (n7 < 0) {
                    n7 += n4;
                }
                n8 = ++n;
            }
            if ((n5 = n3 * n5 % n4) < 0) {
                n5 += n4;
            }
            n6 = ++n2;
        }
        if (this.cfr_renamed_4 == 1) {
            int n10 = n2 = 1;
            while (n10 < n4 - 1) {
                if (this.cfr_renamed_3[nArray[n2 + 1]][0] == -1) {
                    this.cfr_renamed_3[nArray[n2 + 1]][0] = nArray[n4 - n2];
                } else {
                    this.cfr_renamed_3[nArray[n2 + 1]][1] = nArray[n4 - n2];
                }
                n10 = ++n2;
            }
            n2 = this.cfr_renamed_1 >> 1;
            int n11 = n = 1;
            while (n11 <= n2) {
                sprwla sprwla4;
                if (this.cfr_renamed_3[n - 1][0] == -1) {
                    sprwla sprwla5 = this;
                    sprwla4 = sprwla5;
                    sprwla5.cfr_renamed_3[n - 1][0] = n2 + n - 1;
                } else {
                    sprwla sprwla6 = this;
                    sprwla4 = sprwla6;
                    sprwla6.cfr_renamed_3[n - 1][1] = n2 + n - 1;
                }
                if (sprwla4.cfr_renamed_3[n2 + n - 1][0] == -1) {
                    this.cfr_renamed_3[n2 + n - 1][0] = n - 1;
                } else {
                    this.cfr_renamed_3[n2 + n - 1][1] = n - 1;
                }
                n11 = ++n;
            }
            return;
        } else {
            if (this.cfr_renamed_4 != 2) throw new RuntimeException(sprkyca.cfr_renamed_9("QcRt\u001eyG}[-\u000f-Q\u007f\u001eyG}[-\f-W`Na[`[cJhZ"));
            int n12 = n2 = 1;
            while (n12 < n4 - 1) {
                if (this.cfr_renamed_3[nArray[n2 + 1]][0] == -1) {
                    this.cfr_renamed_3[nArray[n2 + 1]][0] = nArray[n4 - n2];
                } else {
                    this.cfr_renamed_3[nArray[n2 + 1]][1] = nArray[n4 - n2];
                }
                n12 = ++n2;
            }
        }
    }

    @Override
    public void cfr_renamed_1025() {
        if (this.cfr_renamed_4 == 1) {
            sprwla sprwla2 = this;
            this.cfr_renamed_4 = (int)new sprhua(this.cfr_renamed_1 + 1, sprkyca.cfr_renamed_9("\u007fAr"));
            return;
        }
        if (this.cfr_renamed_4 == 2) {
            int n;
            sprhua sprhua2 = new sprhua(this.cfr_renamed_1 + 1, sprqte.cfr_renamed_9("\u0006|\f"));
            sprhua sprhua3 = new sprhua(this.cfr_renamed_1 + 1, "X");
            sprhua3.cfr_renamed_972(sprhua2);
            int n2 = n = 1;
            while (n2 < this.cfr_renamed_1) {
                sprhua sprhua4 = sprhua2;
                sprhua2 = sprhua3;
                sprhua3 = sprhua2.cfr_renamed_1007();
                sprhua3.cfr_renamed_972(sprhua4);
                n2 = ++n;
            }
            this.cfr_renamed_4 = (int)sprhua3;
        }
    }

    public int cfr_renamed_1069() {
        return this.cfr_renamed_0;
    }

    @Override
    public spryua cfr_renamed_1020(sprhua arg0) {
        int n;
        sprnma sprnma2 = new sprnma(arg0, this);
        int n2 = n = sprnma2.cfr_renamed_813();
        while (n2 > 1) {
            sprnma sprnma3;
            int n3;
            do {
                int n4;
                sprsta sprsta2 = new sprsta(this, new SecureRandom());
                sprnma sprnma4 = new sprnma(2, sprsta.cfr_renamed_1060(this));
                sprnma4.cfr_renamed_1027(1, sprsta2);
                sprnma sprnma5 = new sprnma(sprnma4);
                int n5 = n4 = 1;
                while (n5 <= this.cfr_renamed_1 - 1) {
                    sprnma sprnma6 = sprnma5;
                    sprnma5 = sprnma6.cfr_renamed_1028(sprnma6, sprnma2);
                    sprnma5 = sprnma5.cfr_renamed_1029(sprnma4);
                    n5 = ++n4;
                }
                sprnma3 = sprnma5.cfr_renamed_1030(sprnma2);
                n3 = sprnma3.cfr_renamed_813();
                n = sprnma2.cfr_renamed_813();
            } while (n3 == 0 || n3 == n);
            n2 = n = (n3 << 1 > n ? sprnma2.cfr_renamed_1031(sprnma3) : new sprnma(sprnma3)).cfr_renamed_813();
        }
        return sprnma2.cfr_renamed_1032(0);
    }

    public int cfr_renamed_1070() {
        return this.cfr_renamed_2;
    }

    public int[][] cfr_renamed_1071(int[][] arg0) {
        int n;
        sprwla sprwla2 = this;
        int[][] nArray = new int[sprwla2.cfr_renamed_1][sprwla2.cfr_renamed_1];
        nArray = arg0;
        sprwla sprwla3 = this;
        int[][] nArray2 = new int[sprwla3.cfr_renamed_1][sprwla3.cfr_renamed_1];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            nArray2[n][n++] = 1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_1) {
            int n4 = n;
            while (n4 < this.cfr_renamed_1) {
                int n5;
                nArray[this.cfr_renamed_1 - 1 - n][n5++] = nArray[n][n];
                n4 = n5;
            }
            n3 = ++n;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprwla(int n) throws RuntimeException {
        sprwla sprwla2;
        void arg0;
        if (n < 3) {
            throw new IllegalArgumentException(sprkyca.cfr_renamed_9("f\u001e`K~J-\\h\u001elJ-Rh_~J-\r"));
        }
        sprwla sprwla3 = this;
        sprwla3.cfr_renamed_1 = arg0;
        sprwla3.cfr_renamed_0 = sprwla3.cfr_renamed_1 / 64;
        sprwla3.cfr_renamed_2 = sprwla3.cfr_renamed_1 & 0x3F;
        if (sprwla3.cfr_renamed_2 == 0) {
            sprwla2 = this;
            this.cfr_renamed_2 = 64;
        } else {
            sprwla sprwla4 = this;
            sprwla2 = sprwla4;
            ++sprwla4.cfr_renamed_0;
        }
        sprwla2.cfr_renamed_1066();
        if (this.cfr_renamed_4 < 3) {
            int n2;
            this.cfr_renamed_3 = new int[this.cfr_renamed_1][2];
            int n3 = n2 = 0;
            while (n3 < this.cfr_renamed_1) {
                sprwla sprwla5 = this;
                sprwla5.cfr_renamed_3[n2][0] = -1;
                int[] nArray = sprwla5.cfr_renamed_3[n2];
                nArray[1] = -1;
                n3 = ++n2;
            }
        } else {
            throw new RuntimeException(new StringBuilder().insert(0, sprqte.cfr_renamed_9("Cf!WiF0B,\u0012&TiF![:\u0012/[,^-\u0012 Ai")).append(this.cfr_renamed_4).toString());
        }
        sprwla sprwla6 = this;
        sprwla6.cfr_renamed_1067();
        sprwla6.cfr_renamed_1025();
        sprwla sprwla7 = this;
        sprwla7.cfr_renamed_3 = (int[][])new Vector();
        sprwla7.cfr_renamed_2 = (int)new Vector();
    }

    private /* synthetic */ int cfr_renamed_1068(int arg0, int arg1) {
        int n;
        int n2;
        SecureRandom secureRandom = new SecureRandom();
        int n3 = 0;
        block0: while (true) {
            int n4 = n3;
            while (n4 == 0) {
                n3 = secureRandom.nextInt();
                if ((n3 %= arg1 - 1) >= 0) continue block0;
                n4 = n3 = n3 + (arg1 - 1);
            }
            break;
        }
        int n5 = n2 = sprzma.cfr_renamed_929(n3, arg1);
        while (n5 % arg0 != 0 || n2 == 0) {
            block3: while (true) {
                int n6 = n3;
                while (n6 == 0) {
                    n3 = secureRandom.nextInt();
                    if ((n3 %= arg1 - 1) >= 0) continue block3;
                    n6 = n3 = n3 + (arg1 - 1);
                }
                break;
            }
            n5 = sprzma.cfr_renamed_929(n3, arg1);
        }
        int n7 = n3;
        n2 = arg0 / n2;
        int n8 = n = 2;
        while (n8 <= n2) {
            n7 *= n3;
            n8 = ++n;
        }
        return n7;
    }
}

