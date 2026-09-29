/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragf;
import com.spire.presentation.packages.sprdcf;
import com.spire.presentation.packages.sprfcf;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprnaf;
import com.spire.presentation.packages.sproef;
import com.spire.presentation.packages.sprtbf;
import com.spire.presentation.packages.sprvwe;
import com.spire.presentation.packages.sprxaea;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Vector;

public class sprjef
extends sprtbf {
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 64;
    public int[][] cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1066() throws RuntimeException {
        int n;
        if ((this.cfr_renamed_3 & 7) == 0) {
            throw new RuntimeException(sprkto.cfr_renamed_9("\u0003-2e2=# 96>*9e3 072 w,$e3,!,$,5)2e5<w}v"));
        }
        Object object = 0;
        int n2 = 0;
        this.cfr_renamed_1 = 1;
        int n3 = n = 0;
        while (n3 != 1) {
            sprjef sprjef2 = this;
            object = sprjef2.cfr_renamed_1 * sprjef2.cfr_renamed_3 + 1;
            if (sproef.cfr_renamed_914(object)) {
                n2 = sproef.cfr_renamed_929(2, object);
                sprjef sprjef3 = this;
                n = sproef.cfr_renamed_830(sprjef3.cfr_renamed_1 * sprjef3.cfr_renamed_3 / n2, (int)this.cfr_renamed_3);
            }
            ++this.cfr_renamed_1;
            n3 = n;
        }
        sprjef sprjef4 = this;
        --sprjef4.cfr_renamed_1;
        if (sprjef4.cfr_renamed_1 == 1) {
            reference v4 = (this.cfr_renamed_3 << 1) + true;
            object = v4;
            if (sproef.cfr_renamed_914((int)v4) && (n = sproef.cfr_renamed_830((int)((this.cfr_renamed_3 << 1) / (n2 = sproef.cfr_renamed_929(2, object))), (int)this.cfr_renamed_3)) == 1) {
                ++this.cfr_renamed_1;
            }
        }
    }

    @Override
    public void cfr_renamed_1025() {
        if (this.cfr_renamed_1 == 1) {
            sprjef sprjef2 = this;
            this.cfr_renamed_1 = (int)new spragf((int)(this.cfr_renamed_3 + true), sprxaea.cfr_renamed_9("7a:"));
            return;
        }
        if (this.cfr_renamed_1 == 2) {
            int n;
            spragf spragf2 = new spragf((int)(this.cfr_renamed_3 + true), sprkto.cfr_renamed_9("\u0018\u000b\u0012"));
            spragf spragf3 = new spragf((int)(this.cfr_renamed_3 + true), "X");
            spragf3.cfr_renamed_5501(spragf2);
            int n2 = n = 1;
            while (n2 < this.cfr_renamed_3) {
                spragf spragf4 = spragf2;
                spragf2 = spragf3;
                spragf3 = spragf2.cfr_renamed_1007();
                spragf3.cfr_renamed_5501(spragf4);
                n2 = ++n;
            }
            this.cfr_renamed_1 = (int)spragf3;
        }
    }

    public int cfr_renamed_1070() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void cfr_renamed_1067() {
        int n;
        int n2;
        int n3;
        if ((this.cfr_renamed_1 & 7) == 0) throw new RuntimeException(sprkto.cfr_renamed_9("5,$-27w+\"7w#\" %e\u0010$\"6$64-2e\u0019*%(6)5$$ 9e>(')2(2+#,27#"));
        sprjef sprjef2 = this;
        int n4 = this.cfr_renamed_1 * sprjef2.cfr_renamed_3 + 1;
        int[] nArray = new int[n4];
        if (sprjef2.cfr_renamed_1 == 1) {
            n3 = 1;
        } else if (this.cfr_renamed_1 == 2) {
            n3 = n4 - 1;
        } else {
            sprjef sprjef3 = this;
            n3 = sprjef3.cfr_renamed_1068(sprjef3.cfr_renamed_1, n4);
        }
        int n5 = 1;
        int n6 = n2 = 0;
        while (n6 < this.cfr_renamed_1) {
            void var6_6;
            int n7 = n5;
            int n8 = n = 0;
            while (n8 < this.cfr_renamed_3) {
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
            n6 = ++var6_6;
        }
        if (this.cfr_renamed_1 == 1) {
            int n10;
            int n11 = n10 = 1;
            while (n11 < n4 - 1) {
                void var6_8;
                if (this.cfr_renamed_3[nArray[var6_8 + true]][0] == -1) {
                    this.cfr_renamed_3[nArray[var6_8 + true]][0] = nArray[n4 - var6_8];
                } else {
                    this.cfr_renamed_3[nArray[var6_8 + true]][1] = nArray[n4 - var6_8];
                }
                n11 = ++var6_8;
            }
            reference var6_9 = this.cfr_renamed_3 >> 1;
            int n12 = n = 1;
            while (n12 <= var6_9) {
                sprjef sprjef4;
                if (this.cfr_renamed_3[n - 1][0] == -1) {
                    sprjef sprjef5 = this;
                    sprjef4 = sprjef5;
                    sprjef5.cfr_renamed_3[n - 1][0] = (int)(var6_9 + n - true);
                } else {
                    sprjef sprjef6 = this;
                    sprjef4 = sprjef6;
                    sprjef6.cfr_renamed_3[n - 1][1] = (int)(var6_9 + n - 1);
                }
                if (sprjef4.cfr_renamed_3[var6_9 + n - true][0] == -1) {
                    this.cfr_renamed_3[var6_9 + n - true][0] = n - 1;
                } else {
                    this.cfr_renamed_3[var6_9 + n - true][1] = n - 1;
                }
                n12 = ++n;
            }
            return;
        } else {
            int n13;
            if (this.cfr_renamed_1 != 2) throw new RuntimeException(sprxaea.cfr_renamed_9("\u0019C\u001aTVY\u000f]\u0013\rG\r\u0019_VY\u000f]\u0013\rD\r\u001f@\u0006A\u0013@\u0013C\u0002H\u0012"));
            int n14 = n13 = 1;
            while (n14 < n4 - 1) {
                void var6_11;
                if (this.cfr_renamed_3[nArray[var6_11 + true]][0] == -1) {
                    this.cfr_renamed_3[nArray[var6_11 + true]][0] = nArray[n4 - var6_11];
                } else {
                    this.cfr_renamed_3[nArray[var6_11 + true]][1] = nArray[n4 - var6_11];
                }
                n14 = ++var6_11;
            }
        }
    }

    public int cfr_renamed_1069() {
        return this.cfr_renamed_0;
    }

    public int[][] cfr_renamed_1071(int[][] arg0) {
        int n;
        sprjef sprjef2 = this;
        int[][] nArray = new int[sprjef2.cfr_renamed_3][sprjef2.cfr_renamed_3];
        nArray = arg0;
        sprjef sprjef3 = this;
        int[][] nArray2 = new int[sprjef3.cfr_renamed_3][sprjef3.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            nArray2[n][n++] = 1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4 = n;
            while (n4 < this.cfr_renamed_3) {
                int n5;
                nArray[this.cfr_renamed_3 - true - n][n5++] = nArray[n][n];
                n4 = n5;
            }
            n3 = ++n;
        }
        return null;
    }

    @Override
    public sprdcf cfr_renamed_5512(spragf arg0) {
        int n;
        sprnaf sprnaf2 = new sprnaf(arg0, this);
        int n2 = n = sprnaf2.cfr_renamed_813();
        while (n2 > 1) {
            sprnaf sprnaf3;
            int n3;
            do {
                int n4;
                sprjef sprjef2 = this;
                sprfcf sprfcf2 = new sprfcf(sprjef2, (SecureRandom)sprjef2.cfr_renamed_4);
                sprnaf sprnaf4 = new sprnaf(2, sprfcf.cfr_renamed_5523(this));
                sprnaf4.cfr_renamed_5514(1, sprfcf2);
                sprnaf sprnaf5 = new sprnaf(sprnaf4);
                int n5 = n4 = 1;
                while (n5 <= this.cfr_renamed_3 - true) {
                    sprnaf sprnaf6 = sprnaf5;
                    sprnaf5 = sprnaf6.cfr_renamed_5515(sprnaf6, sprnaf2);
                    sprnaf5 = sprnaf5.cfr_renamed_5516(sprnaf4);
                    n5 = ++n4;
                }
                sprnaf3 = sprnaf5.cfr_renamed_5517(sprnaf2);
                n3 = sprnaf3.cfr_renamed_813();
                n = sprnaf2.cfr_renamed_813();
            } while (n3 == 0 || n3 == n);
            n2 = n = (n3 << 1 > n ? sprnaf2.cfr_renamed_5518(sprnaf3) : new sprnaf(sprnaf3)).cfr_renamed_813();
        }
        return sprnaf2.cfr_renamed_1032(0);
    }

    @Override
    public void cfr_renamed_5519(sprtbf arg0) {
        sprdcf sprdcf2;
        int n;
        if (this.cfr_renamed_3 != arg0.cfr_renamed_3) {
            throw new IllegalArgumentException(sprxaea.cfr_renamed_9("1kDC0D\u0013A\u0012\u0003\u0015B\u001b]\u0003Y\u0013n9o;L\u0002_\u001fUL\r4\u001cVE\u0017^VLVI\u001fK\u0010H\u0004H\u0018YVI\u0013J\u0004H\u0013\r\u0017C\u0012\r\u0002E\u0003^VN\u0017C\u0018B\u0002\r\u0014HVN\u0019[\u0013_\u0002H\u0012\r\u0002BW"));
        }
        spragf[] spragfArray = new spragf[this.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            spragfArray[n++] = new spragf((int)this.cfr_renamed_3);
            n2 = n;
        }
        while ((sprdcf2 = arg0.cfr_renamed_5512((spragf)this.cfr_renamed_1)).cfr_renamed_805()) {
        }
        sprvwe[] sprvweArray = new sprvwe[this.cfr_renamed_3];
        sprvwe[] sprvweArray2 = sprvweArray;
        sprvweArray[0] = (sprdcf)sprdcf2.clone();
        int n3 = n = 1;
        while (n3 < this.cfr_renamed_3) {
            sprvweArray2[++n] = ((sprdcf)sprvweArray2[n - 1]).cfr_renamed_1048();
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_3) {
                if (((sprdcf)sprvweArray2[n]).cfr_renamed_1012(n5)) {
                    spragfArray[this.cfr_renamed_3 - n5 - true].cfr_renamed_949((int)(this.cfr_renamed_3 - n - true));
                }
                n6 = ++n5;
            }
            n4 = ++n;
        }
        sprjef sprjef2 = this;
        sprjef2.cfr_renamed_2.addElement(arg0);
        sprjef2.cfr_renamed_0.addElement(spragfArray);
        sprtbf sprtbf2 = arg0;
        sprtbf2.cfr_renamed_2.addElement(this);
        sprtbf2.cfr_renamed_0.addElement(this.cfr_renamed_5522(spragfArray));
    }

    private /* synthetic */ int cfr_renamed_1068(int arg0, int arg1) {
        int n;
        int n2;
        Random random = new Random();
        int n3 = 0;
        block0: while (true) {
            int n4 = n3;
            while (n4 == 0) {
                n3 = random.nextInt();
                if ((n3 %= arg1 - 1) >= 0) continue block0;
                n4 = n3 = n3 + (arg1 - 1);
            }
            break;
        }
        int n5 = n2 = sproef.cfr_renamed_929(n3, arg1);
        while (n5 % arg0 != 0 || n2 == 0) {
            block3: while (true) {
                int n6 = n3;
                while (n6 == 0) {
                    n3 = random.nextInt();
                    if ((n3 %= arg1 - 1) >= 0) continue block3;
                    n6 = n3 = n3 + (arg1 - 1);
                }
                break;
            }
            n5 = sproef.cfr_renamed_929(n3, arg1);
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

    /*
     * WARNING - void declaration
     */
    public sprjef(int n, SecureRandom secureRandom) throws RuntimeException {
        super((SecureRandom)arg1);
        sprjef sprjef2;
        void arg0;
        void arg1;
        if (n < 3) {
            throw new IllegalArgumentException(sprkto.cfr_renamed_9(".w(\"6#e5 w$#e; 66#ed"));
        }
        sprjef sprjef3 = this;
        sprjef3.cfr_renamed_3 = arg0;
        sprjef3.cfr_renamed_0 = (int)(sprjef3.cfr_renamed_3 / 64);
        sprjef3.cfr_renamed_4 = sprjef3.cfr_renamed_3 & 0x3F;
        if (sprjef3.cfr_renamed_4 == 0) {
            sprjef2 = this;
            this.cfr_renamed_4 = 64;
        } else {
            sprjef sprjef4 = this;
            sprjef2 = sprjef4;
            ++sprjef4.cfr_renamed_0;
        }
        sprjef2.cfr_renamed_1066();
        if (this.cfr_renamed_1 < 3) {
            int n2;
            this.cfr_renamed_3 = new int[this.cfr_renamed_3][2];
            int n3 = n2 = 0;
            while (n3 < this.cfr_renamed_3) {
                sprjef sprjef5 = this;
                sprjef5.cfr_renamed_3[n2][0] = -1;
                int[] nArray = sprjef5.cfr_renamed_3[n2];
                nArray[1] = -1;
                n3 = ++n2;
            }
        } else {
            throw new RuntimeException(new StringBuilder().insert(0, sprxaea.cfr_renamed_9("|y\u001eHVY\u000f]\u0013\r\u0019KVY\u001eD\u0005\r\u0010D\u0013A\u0012\r\u001f^V")).append(this.cfr_renamed_1).toString());
        }
        sprjef sprjef6 = this;
        sprjef6.cfr_renamed_1067();
        sprjef6.cfr_renamed_1025();
        sprjef sprjef7 = this;
        sprjef7.cfr_renamed_2 = (int)new Vector();
        sprjef7.cfr_renamed_0 = (int)new Vector();
    }
}

