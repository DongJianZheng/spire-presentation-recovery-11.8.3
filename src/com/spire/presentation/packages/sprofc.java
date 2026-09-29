/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprccd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdhba;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjb;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprkrc;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzld;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class sprofc
extends SignatureSpi
implements sprm,
sprs {
    private spruj cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private static byte[] cfr_renamed_4;

    @Override
    public void engineSetParameter(String arg0, Object arg1) {
        throw new UnsupportedOperationException(sprqgo.cfr_renamed_9("}\f\u007f\u000bv\u0007K\u0007l2y\u0010y\u000f}\u0016}\u00108\u0017v\u0011m\u0012h\rj\u0016}\u0006"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineSign() throws SignatureException {
        sprofc sprofc2 = this;
        byte[] byArray = new byte[sprofc2.cfr_renamed_3.cfr_renamed_1218()];
        sprofc2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            BigInteger[] bigIntegerArray = this.cfr_renamed_2.cfr_renamed_125(byArray);
            byte[] byArray2 = bigIntegerArray[0].toByteArray();
            byte[] byArray3 = bigIntegerArray[1].toByteArray();
            byte[] byArray4 = new byte[byArray2.length > byArray3.length ? byArray2.length * 2 : byArray3.length * 2];
            System.arraycopy(byArray3, 0, byArray4, byArray4.length / 2 - byArray3.length, byArray3.length);
            System.arraycopy(byArray2, 0, byArray4, byArray4.length - byArray2.length, byArray2.length);
            return new sprlqe(byArray4).cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new SignatureException(exception.toString());
        }
    }

    @Override
    public void engineInitVerify(PublicKey arg0) throws InvalidKeyException {
        sprofc sprofc2;
        sprhgb sprhgb2;
        if (arg0 instanceof sprvb) {
            sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
            sprofc2 = this;
        } else {
            try {
                byte[] byArray = arg0.getEncoded();
                arg0 = sprbrb.cfr_renamed_1255(sprdce.cfr_renamed_23(byArray));
                if (!(arg0 instanceof sprvb)) {
                    throw new InvalidKeyException(sprdhba.cfr_renamed_9("_\u0007RAHFN\u0003_\t[\bU\u0015YFW\u0003EFH\u001fL\u0003\u001c\u000fRFx5}F^\u0007O\u0003XFO\u000f[\bY\u0014"));
                }
                sprhgb2 = sprjkc.cfr_renamed_1216(arg0);
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprqgo.cfr_renamed_9("{\u0003vElBj\u0007{\r\u007f\fq\u0011}Bs\u0007aBl\u001bh\u00078\u000bvB\\1YBz\u0003k\u0007|Bk\u000b\u007f\f}\u0010"));
            }
            sprofc2 = this;
        }
        sprofc2.cfr_renamed_3 = new sprzld(this.cfr_renamed_2506(((sprccd)arg0).cfr_renamed_2387()));
        this.cfr_renamed_2.cfr_renamed_1217(false, sprhgb2);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean engineVerify(byte[] arg0) throws SignatureException {
        sprofc sprofc2 = this;
        byte[] byArray = new byte[sprofc2.cfr_renamed_3.cfr_renamed_1218()];
        sprofc2.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
        try {
            byte[] byArray2 = ((sprxue)sprxue.cfr_renamed_184(arg0)).cfr_renamed_186();
            byte[] byArray3 = new byte[byArray2.length / 2];
            byte[] byArray4 = new byte[byArray2.length / 2];
            System.arraycopy(byArray2, 0, byArray4, 0, byArray2.length / 2);
            System.arraycopy(byArray2, byArray2.length / 2, byArray3, 0, byArray2.length / 2);
            BigInteger[] bigIntegerArray = new BigInteger[2];
            bigIntegerArray[0] = new BigInteger(1, byArray3);
            bigIntegerArray[1] = new BigInteger(1, byArray4);
            return this.cfr_renamed_2.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (Exception exception) {
            throw new SignatureException(sprdhba.cfr_renamed_9("\u0003N\u0014S\u0014\u001c\u0002Y\u0005S\u0002U\b[FO\u000f[\b]\u0012I\u0014YF^\u001fH\u0003OH"));
        }
    }

    @Override
    public void engineUpdate(byte arg0) throws SignatureException {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    @Override
    public Object engineGetParameter(String arg0) {
        throw new UnsupportedOperationException(sprqgo.cfr_renamed_9("}\f\u007f\u000bv\u0007K\u0007l2y\u0010y\u000f}\u0016}\u00108\u0017v\u0011m\u0012h\rj\u0016}\u0006"));
    }

    @Override
    public void engineSetParameter(AlgorithmParameterSpec arg0) {
        throw new UnsupportedOperationException(sprdhba.cfr_renamed_9("Y\b[\u000fR\u0003o\u0003H6]\u0014]\u000bY\u0012Y\u0014\u001c\u0013R\u0015I\u0016L\tN\u0012Y\u0002"));
    }

    @Override
    public void engineInitSign(PrivateKey arg0) throws InvalidKeyException {
        sprhgb sprhgb2 = null;
        if (arg0 instanceof sprjb) {
            sprhgb2 = sprjkc.cfr_renamed_1220(arg0);
        }
        this.cfr_renamed_3 = new sprzld(cfr_renamed_4);
        if (this.appRandom != null) {
            this.cfr_renamed_2.cfr_renamed_1217(true, new spraed(sprhgb2, this.appRandom));
            return;
        }
        this.cfr_renamed_2.cfr_renamed_1217(true, sprhgb2);
    }

    public sprofc() {
        sprofc sprofc2 = this;
        sprofc2.cfr_renamed_2 = new sprkrc();
    }

    public byte[] cfr_renamed_2506(byte[] arg0) {
        int n;
        byte[] byArray = new byte[128];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            byArray[n * 2] = (byte)(arg0[n] >> 4 & 0xF);
            int n3 = n * 2 + 1;
            byte by = (byte)(arg0[n] & 0xF);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    static {
        byte[] byArray = new byte[128];
        byArray[0] = 10;
        byArray[1] = 9;
        byArray[2] = 13;
        byArray[3] = 6;
        byArray[4] = 14;
        byArray[5] = 11;
        byArray[6] = 4;
        byArray[7] = 5;
        byArray[8] = 15;
        byArray[9] = 1;
        byArray[10] = 3;
        byArray[11] = 12;
        byArray[12] = 7;
        byArray[13] = 0;
        byArray[14] = 8;
        byArray[15] = 2;
        byArray[16] = 8;
        byArray[17] = 0;
        byArray[18] = 12;
        byArray[19] = 4;
        byArray[20] = 9;
        byArray[21] = 6;
        byArray[22] = 7;
        byArray[23] = 11;
        byArray[24] = 2;
        byArray[25] = 3;
        byArray[26] = 1;
        byArray[27] = 15;
        byArray[28] = 5;
        byArray[29] = 14;
        byArray[30] = 10;
        byArray[31] = 13;
        byArray[32] = 15;
        byArray[33] = 6;
        byArray[34] = 5;
        byArray[35] = 8;
        byArray[36] = 14;
        byArray[37] = 11;
        byArray[38] = 10;
        byArray[39] = 4;
        byArray[40] = 12;
        byArray[41] = 0;
        byArray[42] = 3;
        byArray[43] = 7;
        byArray[44] = 2;
        byArray[45] = 9;
        byArray[46] = 1;
        byArray[47] = 13;
        byArray[48] = 3;
        byArray[49] = 8;
        byArray[50] = 13;
        byArray[51] = 9;
        byArray[52] = 6;
        byArray[53] = 11;
        byArray[54] = 15;
        byArray[55] = 0;
        byArray[56] = 2;
        byArray[57] = 5;
        byArray[58] = 12;
        byArray[59] = 10;
        byArray[60] = 4;
        byArray[61] = 14;
        byArray[62] = 1;
        byArray[63] = 7;
        byArray[64] = 15;
        byArray[65] = 8;
        byArray[66] = 14;
        byArray[67] = 9;
        byArray[68] = 7;
        byArray[69] = 2;
        byArray[70] = 0;
        byArray[71] = 13;
        byArray[72] = 12;
        byArray[73] = 6;
        byArray[74] = 1;
        byArray[75] = 5;
        byArray[76] = 11;
        byArray[77] = 4;
        byArray[78] = 3;
        byArray[79] = 10;
        byArray[80] = 2;
        byArray[81] = 8;
        byArray[82] = 9;
        byArray[83] = 7;
        byArray[84] = 5;
        byArray[85] = 15;
        byArray[86] = 0;
        byArray[87] = 11;
        byArray[88] = 12;
        byArray[89] = 1;
        byArray[90] = 13;
        byArray[91] = 14;
        byArray[92] = 10;
        byArray[93] = 3;
        byArray[94] = 6;
        byArray[95] = 4;
        byArray[96] = 3;
        byArray[97] = 8;
        byArray[98] = 11;
        byArray[99] = 5;
        byArray[100] = 6;
        byArray[101] = 4;
        byArray[102] = 14;
        byArray[103] = 10;
        byArray[104] = 2;
        byArray[105] = 12;
        byArray[106] = 1;
        byArray[107] = 7;
        byArray[108] = 9;
        byArray[109] = 15;
        byArray[110] = 13;
        byArray[111] = 0;
        byArray[112] = 1;
        byArray[113] = 2;
        byArray[114] = 3;
        byArray[115] = 14;
        byArray[116] = 6;
        byArray[117] = 13;
        byArray[118] = 11;
        byArray[119] = 8;
        byArray[120] = 15;
        byArray[121] = 10;
        byArray[122] = 12;
        byArray[123] = 5;
        byArray[124] = 7;
        byArray[125] = 9;
        byArray[126] = 0;
        byArray[127] = 4;
        cfr_renamed_4 = byArray;
    }
}

