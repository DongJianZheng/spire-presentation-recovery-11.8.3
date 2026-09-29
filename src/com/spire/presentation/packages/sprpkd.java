/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprakd;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprpdd;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprsfy;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruyda;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.util.Vector;

public class sprpkd
implements sprh {
    private static BigInteger cfr_renamed_91;
    private static BigInteger cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprakd cfr_renamed_3;
    private Vector[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        byte[] byArray;
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprsfy.cfr_renamed_9("\t\u0014$\u0016&\u0016/\u0010\u0014\u0001\"\u0007)U\"\u001b \u001c)\u0010g\u001b(\u0001g\u001c)\u001c3\u001c&\u0019.\u0006\"\u0011"));
        }
        if (arg2 > this.cfr_renamed_1344() + 1) {
            throw new sprjkd(spruyda.cfr_renamed_9("aAxZ|\u000f|@g\u000fdNzHm\u000fn@z\u000fFNkLiL`J%||JzA(La_`Jz\u0001\u0002"));
        }
        if (!this.cfr_renamed_1 && arg2 < this.cfr_renamed_1344()) {
            throw new sprpjd(sprsfy.cfr_renamed_9("\u0005\u0019(\u0016,9\"\u001b \u0001/U#\u001a\"\u0006g\u001b(\u0001g\u0018&\u0001$\u001dg\u0018(\u00112\u00192\u0006g\u0013(\u0007g;&\u0016$\u0014$\u001d\"X\u0014\u0001\"\u0007)U$\u001c7\u001d\"\u0007i\u007f"));
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        } else {
            byArray = arg0;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        if (this.cfr_renamed_2) {
            System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("aAxZ|\u000fi\\(maHAA|JoJz\u0015(")).append(bigInteger).toString());
        }
        if (this.cfr_renamed_1) {
            byte[] byArray2 = this.cfr_renamed_3646(bigInteger);
            return byArray2;
        }
        Vector<BigInteger> vector = new Vector<BigInteger>();
        sprpdd sprpdd2 = (sprpdd)this.cfr_renamed_3;
        Vector vector2 = sprpdd2.cfr_renamed_3346();
        int n2 = n = 0;
        while (n2 < vector2.size()) {
            BigInteger bigInteger2 = bigInteger.modPow(sprpdd2.cfr_renamed_3347().divide((BigInteger)vector2.elementAt(n)), sprpdd2.cfr_renamed_2295());
            sprpkd sprpkd2 = this;
            Vector vector3 = sprpkd2.cfr_renamed_4[n];
            if (sprpkd2.cfr_renamed_4[n].size() != ((BigInteger)vector2.elementAt(n)).intValue()) {
                if (this.cfr_renamed_2) {
                    System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("%5\u001c*\u0010g\u001c4U")).append(vector2.elementAt(n)).append(spruyda.cfr_renamed_9("\u0003(Cg@cZx\u000f|NjCm\u000f`N{\u000f{FrJ(")).append(vector3.size()).toString());
                }
                throw new sprpjd(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("\u0002\u00075\u001a5U.\u001bg\u0019(\u001a,\u00007U\u0006\u00075\u0014>U!\u001a5U")).append(((BigInteger)vector2.elementAt(n)).intValue()).append(spruyda.cfr_renamed_9("\u0015(|aUm\u000feF{Bi[kG&\u000fMWxJk[mK(nz]iVDF{[(Xa[`\u000fdJfH|G(")).append(((BigInteger)vector2.elementAt(n)).intValue()).append(sprsfy.cfr_renamed_9("U%\u00003U!\u001a2\u001b#U\u0006\u00075\u0014>9.\u00063U(\u0013g\u0019\"\u001b \u0001/U")).append(this.cfr_renamed_4[n].size()).toString());
            }
            int n3 = vector3.indexOf(bigInteger2);
            if (n3 == -1) {
                if (this.cfr_renamed_2) {
                    int n4;
                    System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("nk[}Nd\u000fx]aBm\u000fa\\(")).append(vector2.elementAt(n)).toString());
                    System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("1\"\u00165\f7\u0001\"\u0011g\u0003&\u00192\u0010g\u001c4U")).append(bigInteger2).toString());
                    System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("D@gD}_DF{[(Ig](")).append(vector2.elementAt(n)).append(sprsfy.cfr_renamed_9("U0\u001c3\u001dg\u0006.\u000f\"U")).append(this.cfr_renamed_4[n].size()).append(spruyda.cfr_renamed_9("(F{\u0015(")).toString());
                    int n5 = n4 = 0;
                    while (n5 < this.cfr_renamed_4[n].size()) {
                        System.out.println(this.cfr_renamed_4[n].elementAt(n4++));
                        n5 = n4;
                    }
                }
                throw new sprpjd(sprsfy.cfr_renamed_9("9(\u001a,\u00007U!\u0014.\u0019\"\u0011"));
            }
            vector.addElement(BigInteger.valueOf(n3));
            n2 = ++n;
        }
        BigInteger bigInteger3 = sprpkd.cfr_renamed_3647(vector, vector2);
        byte[] byArray3 = bigInteger3.toByteArray();
        return byArray3;
    }

    public void cfr_renamed_3648(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    static {
        cfr_renamed_0 = BigInteger.valueOf(0L);
        cfr_renamed_91 = BigInteger.valueOf(1L);
    }

    public byte[] cfr_renamed_3646(BigInteger arg0) {
        sprpkd sprpkd2 = this;
        byte[] byArray = sprpkd2.cfr_renamed_3.cfr_renamed_2295().toByteArray();
        sprzra.cfr_renamed_492(byArray, (byte)0);
        byte[] byArray2 = sprpkd2.cfr_renamed_3.cfr_renamed_1145().modPow(arg0, this.cfr_renamed_3.cfr_renamed_2295()).toByteArray();
        System.arraycopy(byArray2, 0, byArray, byArray.length - byArray2.length, byArray2.length);
        if (this.cfr_renamed_2) {
            System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("MAk]q_|Jl\u000f~NdZm\u000fa\\2\u000f(")).append(new BigInteger(byArray)).toString());
        }
        return byArray;
    }

    public sprpkd() {
        sprpkd sprpkd2 = this;
        sprpkd2.cfr_renamed_4 = null;
        sprpkd2.cfr_renamed_2 = false;
    }

    public byte[] cfr_renamed_3649(byte[] arg0) throws sprpjd {
        if (this.cfr_renamed_2) {
            System.out.println();
        }
        if (arg0.length > this.cfr_renamed_1344()) {
            byte[] byArray;
            sprpkd sprpkd2 = this;
            int n = sprpkd2.cfr_renamed_1344();
            int n2 = sprpkd2.cfr_renamed_1339();
            if (sprpkd2.cfr_renamed_2) {
                System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("<)\u00052\u0001g\u0017+\u001a$\u001e4\u001c=\u0010g\u001c4OgU")).append(n).append(spruyda.cfr_renamed_9("\u000fjV|J{")).toString());
                System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9(":2\u00017\u00003U%\u0019(\u0016,\u0006.\u000f\"U.\u0006}U")).append(n2).append(spruyda.cfr_renamed_9("\u000fjV|J{")).toString());
                System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("1&\u0001&U/\u00144U+\u0010)\u00123\u001d}[i[iU")).append(arg0.length).append(spruyda.cfr_renamed_9("\u000fjV|J{")).toString());
            }
            int n3 = 0;
            int n4 = 0;
            byte[] byArray2 = new byte[(arg0.length / n + 1) * n2];
            while (n3 < arg0.length) {
                sprpkd sprpkd3;
                if (n3 + n < arg0.length) {
                    sprpkd sprpkd4 = this;
                    sprpkd3 = sprpkd4;
                    byArray = sprpkd4.cfr_renamed_1337(arg0, n3, n);
                    n3 += n;
                } else {
                    byArray = this.cfr_renamed_1337(arg0, n3, arg0.length - n3);
                    n3 += arg0.length - n3;
                    sprpkd3 = this;
                }
                if (sprpkd3.cfr_renamed_2) {
                    System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("\u001b\"\u0002g\u0011&\u0001&\u0005(\u0006g\u001c4U")).append(n3).toString());
                }
                if (byArray != null) {
                    System.arraycopy(byArray, 0, byArray2, n4, byArray.length);
                    n4 += byArray.length;
                    continue;
                }
                if (this.cfr_renamed_2) {
                    System.out.println(spruyda.cfr_renamed_9("La_`Jz\u000fzJ|ZzAmK(A}Cd"));
                }
                throw new sprpjd(sprsfy.cfr_renamed_9("$\u001c7\u001d\"\u0007g\u0007\"\u00012\u0007)\u0010#U)\u0000+\u0019"));
            }
            byArray = new byte[n4];
            System.arraycopy(byArray2, 0, byArray, 0, n4);
            if (this.cfr_renamed_2) {
                System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("]m[}]fFfH(")).append(byArray.length).append(sprsfy.cfr_renamed_9("g\u0017>\u0001\"\u0006")).toString());
            }
            return byArray;
        }
        if (this.cfr_renamed_2) {
            System.out.println(spruyda.cfr_renamed_9("Ki[i\u000f{FrJ(F{\u000fdJ{\\([`Jf\u000faAxZ|\u000fjCgLc\u000f{FrJ$\u000fx]gLm\\{FfH(Ka]mL|Cq"));
        }
        return this.cfr_renamed_1337(arg0, 0, arg0.length);
    }

    @Override
    public int cfr_renamed_1344() {
        if (this.cfr_renamed_1) {
            return (this.cfr_renamed_3.cfr_renamed_3348() + 7) / 8 - 1;
        }
        return this.cfr_renamed_3.cfr_renamed_2295().toByteArray().length;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        sprt arg1;
        void arg0;
        this.cfr_renamed_1 = arg0;
        if (sprt2 instanceof spraed) {
            arg1 = ((spraed)arg1).cfr_renamed_284();
        }
        this.cfr_renamed_3 = (sprakd)arg1;
        if (!this.cfr_renamed_1) {
            int n;
            if (this.cfr_renamed_2) {
                System.out.println(sprsfy.cfr_renamed_9("6(\u001b4\u00015\u0000$\u0001.\u001b U+\u001a(\u001e2\u0005g45\u0007&\f"));
            }
            sprpdd sprpdd2 = (sprpdd)this.cfr_renamed_3;
            Vector vector = sprpdd2.cfr_renamed_3346();
            this.cfr_renamed_4 = new Vector[vector.size()];
            int n2 = n = 0;
            while (n2 < vector.size()) {
                int n3;
                BigInteger bigInteger = (BigInteger)vector.elementAt(n);
                int n4 = bigInteger.intValue();
                sprpkd sprpkd2 = this;
                sprpkd2.cfr_renamed_4[n] = new Vector();
                sprpkd2.cfr_renamed_4[n].addElement(cfr_renamed_91);
                if (sprpkd2.cfr_renamed_2) {
                    System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("lgA{[zZk[aAo\u000fd@gD}_(nz]iVDF{[(Ig](")).append(n4).toString());
                }
                BigInteger bigInteger2 = cfr_renamed_0;
                int n5 = n3 = 1;
                while (n5 < n4) {
                    bigInteger2 = bigInteger2.add(sprpdd2.cfr_renamed_3347());
                    BigInteger bigInteger3 = bigInteger2.divide(bigInteger);
                    this.cfr_renamed_4[n].addElement(sprpdd2.cfr_renamed_1145().modPow(bigInteger3, sprpdd2.cfr_renamed_2295()));
                    n5 = ++n3;
                }
                n2 = ++n;
            }
        }
    }

    public byte[] cfr_renamed_3650(byte[] arg0, byte[] arg1) throws sprpjd {
        if (this.cfr_renamed_1) {
            if (arg0.length > this.cfr_renamed_1339() || arg1.length > this.cfr_renamed_1339()) {
                throw new sprpjd(sprsfy.cfr_renamed_9("7+\u001a$\u001e\u000b\u0010)\u00123\u001dg\u0001(\u001ag\u0019&\u0007 \u0010g\u0013(\u0007g\u0006.\u00187\u0019\"U&\u0011#\u001c3\u001c(\u001bi\u007f"));
            }
        } else if (arg0.length > this.cfr_renamed_1344() || arg1.length > this.cfr_renamed_1344()) {
            throw new sprpjd(spruyda.cfr_renamed_9("JCgLccmAo[`\u000f|@g\u000fdNzHm\u000fn@z\u000f{Fe_dJ(NlKa[a@f\u0001\u0002"));
        }
        BigInteger bigInteger = new BigInteger(1, arg0);
        BigInteger bigInteger2 = new BigInteger(1, arg1);
        BigInteger bigInteger3 = bigInteger.multiply(bigInteger2);
        bigInteger3 = bigInteger3.mod(this.cfr_renamed_3.cfr_renamed_2295());
        if (this.cfr_renamed_2) {
            System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("$]*DnU&\u0006g7.\u0012\u000e\u001b3\u0010 \u00105Oi[i[i[iU")).append(bigInteger).toString());
            System.out.println(new StringBuilder().insert(0, spruyda.cfr_renamed_9("L B:\u0006(N{\u000fJFoff[mHm]2\u0001&\u0001&\u0001&\u0001(")).append(bigInteger2).toString());
            System.out.println(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("$]*Dn_$]*GnP)UzU$]*Dl\u0018u\\b\u001b}U")).append(bigInteger3).toString());
        }
        byte[] byArray = this.cfr_renamed_3.cfr_renamed_2295().toByteArray();
        sprzra.cfr_renamed_492(byArray, (byte)0);
        System.arraycopy(bigInteger3.toByteArray(), 0, byArray, byArray.length - bigInteger3.toByteArray().length, bigInteger3.toByteArray().length);
        return byArray;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3647(Vector arg0, Vector arg1) {
        int n;
        BigInteger bigInteger = cfr_renamed_0;
        BigInteger bigInteger2 = cfr_renamed_91;
        int n2 = n = 0;
        while (n2 < arg1.size()) {
            Object e = arg1.elementAt(n);
            bigInteger2 = bigInteger2.multiply((BigInteger)e);
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < arg1.size()) {
            BigInteger bigInteger3 = (BigInteger)arg1.elementAt(n);
            BigInteger bigInteger4 = bigInteger2.divide(bigInteger3);
            BigInteger bigInteger5 = bigInteger4.multiply(bigInteger4.modInverse(bigInteger3));
            bigInteger5 = bigInteger5.multiply((BigInteger)arg0.elementAt(n));
            bigInteger = bigInteger.add(bigInteger5);
            n3 = ++n;
        }
        return bigInteger.mod(bigInteger2);
    }

    @Override
    public int cfr_renamed_1339() {
        if (this.cfr_renamed_1) {
            return this.cfr_renamed_3.cfr_renamed_2295().toByteArray().length;
        }
        return (this.cfr_renamed_3.cfr_renamed_3348() + 7) / 8 - 1;
    }
}

