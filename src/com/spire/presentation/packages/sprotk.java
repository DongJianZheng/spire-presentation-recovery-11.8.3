/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spretc;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprnhk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprqlk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;
import java.util.Vector;

public class sprotk
implements sprwn {
    private boolean cfr_renamed_91;
    private boolean cfr_renamed_0;
    private static BigInteger cfr_renamed_1;
    private static BigInteger cfr_renamed_2;
    private Vector[] cfr_renamed_3;
    private sprnhk cfr_renamed_4;

    public byte[] cfr_renamed_3650(byte[] arg0, byte[] arg1) throws sprull {
        if (this.cfr_renamed_91) {
            if (arg0.length > this.cfr_renamed_1339() || arg1.length > this.cfr_renamed_1339()) {
                throw new sprull(sprpgm.cfr_renamed_9("uGXH\\gREP__\u000bCDX\u000b[JELR\u000bQDE\u000bDBZ[[N\u0017JSO^_^DY\u0005="));
            }
        } else if (arg0.length > this.cfr_renamed_1344() || arg1.length > this.cfr_renamed_1344()) {
            throw new sprull(spretc.cfr_renamed_9("!u\fz\bU\u0006w\u0004m\u000b9\u0017v\f9\u000fx\u0011~\u00069\u0005v\u00119\u0010p\u000ei\u000f|Cx\u0007}\nm\nv\r7i"));
        }
        BigInteger bigInteger = new BigInteger(1, arg0);
        BigInteger bigInteger2 = new BigInteger(1, arg1);
        BigInteger bigInteger3 = bigInteger.multiply(bigInteger2);
        bigInteger3 = bigInteger3.mod(this.cfr_renamed_4.cfr_renamed_2295());
        if (this.cfr_renamed_0) {
            System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("H\u001fF\u0006\u0002\u0017JD\u000buBPbY_RLRY\r\u0005\u0019\u0005\u0019\u0005\u0019\u0005\u0017")).append(bigInteger).toString());
            System.out.println(new StringBuilder().insert(0, spretc.cfr_renamed_9("zKtQ0Cx\u00109!p\u0004P\rm\u0006~\u0006kY7M7M7M7C")).append(bigInteger2).toString());
            System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("H\u001fF\u0006\u0002\u001dH\u001fF\u0005\u0002\u0012E\u0017\u0016\u0017H\u001fF\u0006\u0000Z\u0019\u001e\u000eY\u0011\u0017")).append(bigInteger3).toString());
        }
        byte[] byArray = this.cfr_renamed_4.cfr_renamed_2295().toByteArray();
        sproze.cfr_renamed_492(byArray, (byte)0);
        System.arraycopy(bigInteger3.toByteArray(), 0, byArray, byArray.length - bigInteger3.toByteArray().length, bigInteger3.toByteArray().length);
        return byArray;
    }

    public sprotk() {
        sprotk sprotk2 = this;
        sprotk2.cfr_renamed_3 = null;
        sprotk2.cfr_renamed_0 = false;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        byte[] byArray;
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(spretc.cfr_renamed_9("W\u0002z\u0000x\u0000q\u0006J\u0017|\u0011wC|\r~\nw\u00069\rv\u00179\nw\nm\nx\u000fp\u0010|\u0007"));
        }
        if (arg2 > this.cfr_renamed_1344() + 1) {
            throw new sprddl(sprpgm.cfr_renamed_9("^EG^C\u000bCDX\u000b[JELR\u000bQDE\u000byJTHVH_N\u001axCNEE\u0017H^[_NE\u0005="));
        }
        if (!this.cfr_renamed_91 && arg2 < this.cfr_renamed_1344()) {
            throw new sprull(spretc.cfr_renamed_9("[\u000fv\u0000r/|\r~\u0017qC}\f|\u00109\rv\u00179\u000ex\u0017z\u000b9\u000ev\u0007l\u000fl\u00109\u0005v\u00119-x\u0000z\u0002z\u000b|NJ\u0017|\u0011wCz\ni\u000b|\u00117i"));
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray, 0, arg2);
        } else {
            byArray = arg0;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        if (this.cfr_renamed_0) {
            System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("^EG^C\u000bVX\u0017i^L~ECNPNE\u0011\u0017")).append(bigInteger).toString());
        }
        if (this.cfr_renamed_91) {
            byte[] byArray2 = this.cfr_renamed_3646(bigInteger);
            return byArray2;
        }
        Vector<BigInteger> vector = new Vector<BigInteger>();
        sprqlk sprqlk2 = (sprqlk)this.cfr_renamed_4;
        Vector vector2 = sprqlk2.cfr_renamed_3346();
        int n2 = n = 0;
        while (n2 < vector2.size()) {
            BigInteger bigInteger2 = bigInteger.modPow(sprqlk2.cfr_renamed_3347().divide((BigInteger)vector2.elementAt(n)), sprqlk2.cfr_renamed_2295());
            sprotk sprotk2 = this;
            Vector vector3 = sprotk2.cfr_renamed_3[n];
            if (sprotk2.cfr_renamed_3[n].size() != ((BigInteger)vector2.elementAt(n)).intValue()) {
                if (this.cfr_renamed_0) {
                    System.out.println(new StringBuilder().insert(0, spretc.cfr_renamed_9("3k\nt\u00069\njC")).append(vector2.elementAt(n)).append(sprpgm.cfr_renamed_9("\u0007\u0017GXD\\^G\u000bCJUGR\u000b_JD\u000bDBMN\u0017")).append(vector3.size()).toString());
                }
                throw new sprull(new StringBuilder().insert(0, spretc.cfr_renamed_9("\\\u0011k\fkCp\r9\u000fv\fr\u0016iCX\u0011k\u0002`C\u007f\fkC")).append(((BigInteger)vector2.elementAt(n)).intValue()).append(sprpgm.cfr_renamed_9("\u0011\u0017x^QR\u000bZBDFV_TC\u0019\u000brSGNT_RO\u0017jEYVR{BD_\u0017\\^__\u000b[NYLCC\u0017")).append(((BigInteger)vector2.elementAt(n)).intValue()).append(spretc.cfr_renamed_9("C{\u0016mC\u007f\fl\r}CX\u0011k\u0002`/p\u0010mCv\u00059\u000f|\r~\u0017qC")).append(this.cfr_renamed_3[n].size()).toString());
            }
            int n3 = vector3.indexOf(bigInteger2);
            if (n3 == -1) {
                if (this.cfr_renamed_0) {
                    int n4;
                    System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("jT_BJ[\u000bGY^FR\u000b^X\u0017")).append(vector2.elementAt(n)).toString());
                    System.out.println(new StringBuilder().insert(0, spretc.cfr_renamed_9("'|\u0000k\u001ai\u0017|\u00079\u0015x\u000fl\u00069\njC")).append(bigInteger2).toString());
                    System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("{DX@B[{BD_\u0017MXY\u0017")).append(vector2.elementAt(n)).append(spretc.cfr_renamed_9("Cn\nm\u000b9\u0010p\u0019|C")).append(this.cfr_renamed_3[n].size()).append(sprpgm.cfr_renamed_9("\u0017BD\u0011\u0017")).toString());
                    int n5 = n4 = 0;
                    while (n5 < this.cfr_renamed_3[n].size()) {
                        System.out.println(this.cfr_renamed_3[n].elementAt(n4++));
                        n5 = n4;
                    }
                }
                throw new sprull(spretc.cfr_renamed_9("/v\fr\u0016iC\u007f\u0002p\u000f|\u0007"));
            }
            vector.addElement(BigInteger.valueOf(n3));
            n2 = ++n;
        }
        BigInteger bigInteger3 = sprotk.cfr_renamed_3647(vector, vector2);
        byte[] byArray3 = bigInteger3.toByteArray();
        return byArray3;
    }

    private static /* synthetic */ BigInteger cfr_renamed_3647(Vector arg0, Vector arg1) {
        int n;
        BigInteger bigInteger = cfr_renamed_2;
        BigInteger bigInteger2 = cfr_renamed_1;
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
        if (this.cfr_renamed_91) {
            return this.cfr_renamed_4.cfr_renamed_2295().toByteArray().length;
        }
        return (this.cfr_renamed_4.cfr_renamed_3348() + 7) / 8 - 1;
    }

    static {
        cfr_renamed_2 = BigInteger.valueOf(0L);
        cfr_renamed_1 = BigInteger.valueOf(1L);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        sprbj arg1;
        void arg0;
        this.cfr_renamed_91 = arg0;
        if (sprbj2 instanceof sprbgk) {
            arg1 = ((sprbgk)arg1).cfr_renamed_284();
        }
        this.cfr_renamed_4 = (sprnhk)arg1;
        if (!this.cfr_renamed_91) {
            int n;
            if (this.cfr_renamed_0) {
                System.out.println(sprpgm.cfr_renamed_9("tDYXCYBHCBYL\u0017GXD\\^G\u000bvYEJN"));
            }
            sprqlk sprqlk2 = (sprqlk)this.cfr_renamed_4;
            Vector vector = sprqlk2.cfr_renamed_3346();
            this.cfr_renamed_3 = new Vector[vector.size()];
            int n2 = n = 0;
            while (n2 < vector.size()) {
                int n3;
                BigInteger bigInteger = (BigInteger)vector.elementAt(n);
                int n4 = bigInteger.intValue();
                sprotk sprotk2 = this;
                sprotk2.cfr_renamed_3[n] = new Vector();
                sprotk2.cfr_renamed_3[n].addElement(cfr_renamed_1);
                if (sprotk2.cfr_renamed_0) {
                    System.out.println(new StringBuilder().insert(0, spretc.cfr_renamed_9("Z\fw\u0010m\u0011l\u0000m\nw\u00049\u000fv\fr\u0016iCX\u0011k\u0002`/p\u0010mC\u007f\fkC")).append(n4).toString());
                }
                BigInteger bigInteger2 = cfr_renamed_2;
                int n5 = n3 = 1;
                while (n5 < n4) {
                    bigInteger2 = bigInteger2.add(sprqlk2.cfr_renamed_3347());
                    BigInteger bigInteger3 = bigInteger2.divide(bigInteger);
                    this.cfr_renamed_3[n].addElement(sprqlk2.cfr_renamed_1145().modPow(bigInteger3, sprqlk2.cfr_renamed_2295()));
                    n5 = ++n3;
                }
                n2 = ++n;
            }
        }
        sprybl.cfr_renamed_9170(new sprfdl(sprpgm.cfr_renamed_9("yJTHVH_Nd_RYY"), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_2295()), arg1, sprlrk.cfr_renamed_9915((boolean)arg0)));
    }

    public byte[] cfr_renamed_3646(BigInteger arg0) {
        sprotk sprotk2 = this;
        byte[] byArray = sprotk2.cfr_renamed_4.cfr_renamed_2295().toByteArray();
        sproze.cfr_renamed_492(byArray, (byte)0);
        byte[] byArray2 = sprotk2.cfr_renamed_4.cfr_renamed_1145().modPow(arg0, this.cfr_renamed_4.cfr_renamed_2295()).toByteArray();
        System.arraycopy(byArray2, 0, byArray, byArray.length - byArray2.length, byArray2.length);
        if (this.cfr_renamed_0) {
            System.out.println(new StringBuilder().insert(0, spretc.cfr_renamed_9("&w\u0000k\u001ai\u0017|\u00079\u0015x\u000fl\u00069\njY9C")).append(new BigInteger(byArray)).toString());
        }
        return byArray;
    }

    public byte[] cfr_renamed_3649(byte[] arg0) throws sprull {
        if (this.cfr_renamed_0) {
            System.out.println();
        }
        if (arg0.length > this.cfr_renamed_1344()) {
            byte[] byArray;
            sprotk sprotk2 = this;
            int n = sprotk2.cfr_renamed_1344();
            int n2 = sprotk2.cfr_renamed_1339();
            if (sprotk2.cfr_renamed_0) {
                System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("~EG^C\u000bUGXH\\X^QR\u000b^X\r\u000b\u0017")).append(n).append(spretc.cfr_renamed_9("9\u0001`\u0017|\u0010")).toString());
                System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("x^C[B_\u0017I[DT@DBMN\u0017BD\u0011\u0017")).append(n2).append(spretc.cfr_renamed_9("9\u0001`\u0017|\u0010")).toString());
                System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("sJCJ\u0017CVX\u0017GREP__\u0011\u0019\u0005\u0019\u0005\u0017")).append(arg0.length).append(spretc.cfr_renamed_9("9\u0001`\u0017|\u0010")).toString());
            }
            int n3 = 0;
            int n4 = 0;
            byte[] byArray2 = new byte[(arg0.length / n + 1) * n2];
            while (n3 < arg0.length) {
                sprotk sprotk3;
                if (n3 + n < arg0.length) {
                    sprotk sprotk4 = this;
                    sprotk3 = sprotk4;
                    byArray = sprotk4.cfr_renamed_1337(arg0, n3, n);
                    n3 += n;
                } else {
                    byArray = this.cfr_renamed_1337(arg0, n3, arg0.length - n3);
                    n3 += arg0.length - n3;
                    sprotk3 = this;
                }
                if (sprotk3.cfr_renamed_0) {
                    System.out.println(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("YN@\u000bSJCJGDD\u000b^X\u0017")).append(n3).toString());
                }
                if (byArray != null) {
                    System.arraycopy(byArray, 0, byArray2, n4, byArray.length);
                    n4 += byArray.length;
                    continue;
                }
                if (this.cfr_renamed_0) {
                    System.out.println(spretc.cfr_renamed_9("z\ni\u000b|\u00119\u0011|\u0017l\u0011w\u0006}Cw\u0016u\u000f"));
                }
                throw new sprull(sprpgm.cfr_renamed_9("H^[_NE\u000bENC^EERO\u0017EBG["));
            }
            byArray = new byte[n4];
            System.arraycopy(byArray2, 0, byArray, 0, n4);
            if (this.cfr_renamed_0) {
                System.out.println(new StringBuilder().insert(0, spretc.cfr_renamed_9("k\u0006m\u0016k\rp\r~C")).append(byArray.length).append(sprpgm.cfr_renamed_9("\u000bURCND")).toString());
            }
            return byArray;
        }
        if (this.cfr_renamed_0) {
            System.out.println(spretc.cfr_renamed_9("}\u0002m\u00029\u0010p\u0019|Cp\u00109\u000f|\u0010jCm\u000b|\r9\nw\u0013l\u00179\u0001u\fz\b9\u0010p\u0019|O9\u0013k\fz\u0006j\u0010p\r~C}\nk\u0006z\u0017u\u001a"));
        }
        return this.cfr_renamed_1337(arg0, 0, arg0.length);
    }

    @Override
    public int cfr_renamed_1344() {
        if (this.cfr_renamed_91) {
            return (this.cfr_renamed_4.cfr_renamed_3348() + 7) / 8 - 1;
        }
        return this.cfr_renamed_4.cfr_renamed_2295().toByteArray().length;
    }

    public void cfr_renamed_3648(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }
}

