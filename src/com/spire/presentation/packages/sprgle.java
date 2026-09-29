/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbqe;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprbse;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprfue;
import com.spire.presentation.packages.sprgme;
import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprhte;
import com.spire.presentation.packages.sprhwe;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlwe;
import com.spire.presentation.packages.sprmne;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnh;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprone;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpcka;
import com.spire.presentation.packages.sprppe;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprrue;
import com.spire.presentation.packages.sprsle;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwpe;
import com.spire.presentation.packages.sprwue;
import com.spire.presentation.packages.sprxqe;
import com.spire.presentation.packages.sprxre;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzre;
import com.spire.presentation.packages.sprzve;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprgle
extends FilterInputStream
implements sprnh {
    private final int cfr_renamed_953;
    private final byte[][] cfr_renamed_3;
    private final boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprgle(byte[] byArray, boolean bl) {
        this(new ByteArrayInputStream((byte[])arg0), ((void)arg0).length, (boolean)arg1);
        void arg1;
        void arg0;
    }

    public static int cfr_renamed_4917(InputStream arg0, int arg1) throws IOException {
        int n = arg1 & 0x1F;
        if (n == 31) {
            n = 0;
            int n2 = arg0.read();
            if ((n2 & 0x7F) == 0) {
                throw new IOException(spruuc.cfr_renamed_9("\u0012\u0006\u0003\u001b\u0004\u0019\u0005\f\u0015I\u0002\u001d\u0003\f\u0010\u0004QDQ\u0000\u001f\u001f\u0010\u0005\u0018\rQ\u0001\u0018\u000e\u0019I\u0005\b\u0016I\u001f\u001c\u001c\u000b\u0014\u001bQ\u000f\u001e\u001c\u001f\r"));
            }
            int n3 = n2;
            while (n3 >= 0 && (n2 & 0x80) != 0) {
                n |= n2 & 0x7F;
                n <<= 7;
                n3 = arg0.read();
            }
            if (n2 < 0) {
                throw new EOFException(sprpcka.cfr_renamed_9("drg\u001dGRTSE\u001dHSRTEX\u0001I@Z\u0001K@QTX\u000f"));
            }
            n |= n2 & 0x7F;
        }
        return n;
    }

    public void cfr_renamed_4932(byte[] arg0) throws IOException {
        if (sprbsa.cfr_renamed_476(this, arg0) != arg0.length) {
            throw new EOFException(spruuc.cfr_renamed_9(",>/Q\f\u001f\n\u001e\u001c\u001f\u001d\u0014\u001b\u0014\rQ\u0000\u001fI\u001c\u0000\u0015\r\u001d\fQ\u0006\u0017I\u001e\u000b\u001b\f\u0012\u001d"));
        }
    }

    public sprlre cfr_renamed_4933() throws IOException {
        sprvva sprvva2;
        sprlre sprlre2 = new sprlre();
        sprgle sprgle2 = this;
        while ((sprvva2 = sprgle2.cfr_renamed_24()) != null) {
            sprgle2 = this;
            sprlre2.cfr_renamed_49(sprvva2);
        }
        return sprlre2;
    }

    public int cfr_renamed_4934() throws IOException {
        sprgle sprgle2 = this;
        return sprgle.cfr_renamed_4918(sprgle2, sprgle2.cfr_renamed_953);
    }

    private static /* synthetic */ byte[] cfr_renamed_4935(sprzre arg0, byte[][] arg1) throws IOException {
        sprzre sprzre2 = arg0;
        int n = sprzre2.cfr_renamed_4583();
        if (sprzre2.cfr_renamed_4583() < arg1.length) {
            byte[] byArray = arg1[n];
            if (byArray == null) {
                int n2 = n;
                byte[] byArray2 = new byte[n2];
                arg1[n2] = byArray2;
                byArray = byArray2;
            }
            sprbsa.cfr_renamed_476(arg0, byArray);
            return byArray;
        }
        return arg0.cfr_renamed_954();
    }

    public int cfr_renamed_4584() {
        return this.cfr_renamed_953;
    }

    public sprgle(InputStream arg0, boolean arg1) {
        InputStream inputStream = arg0;
        this(inputStream, sprcme.cfr_renamed_4582(inputStream), arg1);
    }

    public sprgle(InputStream arg0) {
        InputStream inputStream = arg0;
        this(inputStream, sprcme.cfr_renamed_4582(inputStream));
    }

    /*
     * WARNING - void declaration
     */
    public sprgle(byte[] byArray) {
        this((InputStream)new ByteArrayInputStream((byte[])arg0), ((void)arg0).length);
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprvva cfr_renamed_4936(int arg0, int arg1, int arg2) throws IOException {
        boolean bl = (arg0 & 0x20) != 0;
        sprzre sprzre2 = new sprzre(this, arg2);
        if ((arg0 & 0x40) != 0) {
            return new sprgwe(bl, arg1, sprzre2.cfr_renamed_954());
        }
        if ((arg0 & 0x80) != 0) {
            return new sprkwe(sprzre2).cfr_renamed_4904(bl, arg1);
        }
        if (!bl) {
            return sprgle.cfr_renamed_4919(arg1, sprzre2, this.cfr_renamed_3);
        }
        switch (arg1) {
            case 4: {
                int n;
                sprlre sprlre2 = this.cfr_renamed_4937(sprzre2);
                sprxue[] sprxueArray = new sprxue[sprlre2.cfr_renamed_84()];
                int n2 = n = 0;
                while (true) {
                    if (n2 == sprxueArray.length) {
                        return new sprnle(sprxueArray);
                    }
                    int n3 = n++;
                    sprxueArray[n3] = (sprxue)sprlre2.cfr_renamed_576(n3);
                    n2 = n;
                }
            }
            case 16: {
                if (this.cfr_renamed_4) {
                    return new sprhte(sprzre2.cfr_renamed_954());
                }
                return sprzve.cfr_renamed_4798(this.cfr_renamed_4937(sprzre2));
            }
            case 17: {
                return sprzve.cfr_renamed_4799(this.cfr_renamed_4937(sprzre2));
            }
            case 8: {
                return new sprhwe(this.cfr_renamed_4937(sprzre2));
            }
        }
        throw new IOException(new StringBuilder().insert(0, sprpcka.cfr_renamed_9("HOVORVS\u0001I@Z\u0001")).append(arg1).append(spruuc.cfr_renamed_9("Q\f\u001f\n\u001e\u001c\u001f\u001d\u0014\u001b\u0014\r")).toString());
    }

    private static /* synthetic */ char[] cfr_renamed_4938(sprzre arg0) throws IOException {
        int n;
        int n2 = arg0.cfr_renamed_4583() / 2;
        char[] cArray = new char[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = arg0.read();
            if (n4 < 0) {
                return cArray;
            }
            int n5 = arg0.read();
            if (n5 < 0) {
                return cArray;
            }
            cArray[n++] = (char)(n4 << 8 | n5 & 0xFF);
            n3 = n;
        }
        return cArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprvva cfr_renamed_4919(int arg0, sprzre arg1, byte[][] arg2) throws IOException {
        switch (arg0) {
            case 3: {
                return sprmra.cfr_renamed_4806(arg1.cfr_renamed_4583(), arg1);
            }
            case 30: {
                return new sprmne(sprgle.cfr_renamed_4938(arg1));
            }
            case 1: {
                return sprnpe.cfr_renamed_4807(sprgle.cfr_renamed_4935(arg1, arg2));
            }
            case 10: {
                return sprune.cfr_renamed_4807(sprgle.cfr_renamed_4935(arg1, arg2));
            }
            case 24: {
                return new sprrpe(arg1.cfr_renamed_954());
            }
            case 27: {
                return new sprwpe(arg1.cfr_renamed_954());
            }
            case 22: {
                return new sprcae(arg1.cfr_renamed_954());
            }
            case 2: {
                return new sprooe(arg1.cfr_renamed_954(), false);
            }
            case 5: {
                return sprume.cfr_renamed_3;
            }
            case 18: {
                return new sprlwe(arg1.cfr_renamed_954());
            }
            case 6: {
                return sprtzd.cfr_renamed_4807(sprgle.cfr_renamed_4935(arg1, arg2));
            }
            case 4: {
                return new sprlqe(arg1.cfr_renamed_954());
            }
            case 19: {
                return new spraoe(arg1.cfr_renamed_954());
            }
            case 20: {
                return new sprgme(arg1.cfr_renamed_954());
            }
            case 28: {
                return new sprbqe(arg1.cfr_renamed_954());
            }
            case 23: {
                return new sprgpe(arg1.cfr_renamed_954());
            }
            case 12: {
                return new sprxte(arg1.cfr_renamed_954());
            }
            case 26: {
                return new sprrue(arg1.cfr_renamed_954());
            }
        }
        throw new IOException(new StringBuilder().insert(0, sprpcka.cfr_renamed_9("HOVORVS\u0001I@Z\u0001")).append(arg0).append(spruuc.cfr_renamed_9("Q\f\u001f\n\u001e\u001c\u001f\u001d\u0014\u001b\u0014\r")).toString());
    }

    public sprvva cfr_renamed_24() throws IOException {
        int n = this.read();
        if (n <= 0) {
            if (n == 0) {
                throw new IOException(sprpcka.cfr_renamed_9("TSDEQXBIDY\u0001XOY\fRG\u0010BROIDSUN\u0001P@OJXS"));
            }
            return null;
        }
        int n2 = sprgle.cfr_renamed_4917(this, n);
        boolean bl = (n & 0x20) != 0;
        int n3 = this.cfr_renamed_4934();
        if (n3 < 0) {
            if (!bl) {
                throw new IOException(spruuc.cfr_renamed_9("\u0018\u0007\u0015\f\u0017\u0000\u001f\u0000\u0005\fQ\u0005\u0014\u0007\u0016\u001d\u0019I\u0001\u001b\u0018\u0004\u0018\u001d\u0018\u001f\u0014I\u0014\u0007\u0012\u0006\u0015\u0000\u001f\u000eQ\f\u001f\n\u001e\u001c\u001f\u001d\u0014\u001b\u0014\r"));
            }
            sprgle sprgle2 = this;
            sprxre sprxre2 = new sprxre(sprgle2, sprgle2.cfr_renamed_953);
            sprkwe sprkwe2 = new sprkwe(sprxre2, this.cfr_renamed_953);
            if ((n & 0x40) != 0) {
                return new sprbse(n2, sprkwe2).cfr_renamed_2414();
            }
            if ((n & 0x80) != 0) {
                return new sprppe(true, n2, sprkwe2).cfr_renamed_2414();
            }
            switch (n2) {
                case 4: {
                    return new sprfue(sprkwe2).cfr_renamed_2414();
                }
                case 16: {
                    return new sprsle(sprkwe2).cfr_renamed_2414();
                }
                case 17: {
                    return new sprone(sprkwe2).cfr_renamed_2414();
                }
                case 8: {
                    return new sprxqe(sprkwe2).cfr_renamed_2414();
                }
            }
            throw new IOException(sprpcka.cfr_renamed_9("HOVORVS\u0001\u007fdo\u0001RCWD^U\u001dDSBRTSUXSXE"));
        }
        try {
            return this.cfr_renamed_4936(n, n2, n3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprwue(spruuc.cfr_renamed_9("\n\u001e\u001b\u0003\u001c\u0001\u001d\u0014\rQ\u001a\u0005\u001b\u0014\b\u001cI\u0015\f\u0005\f\u0012\u001d\u0014\r"), illegalArgumentException);
        }
    }

    public sprlre cfr_renamed_4937(sprzre arg0) throws IOException {
        return new sprgle(arg0).cfr_renamed_4933();
    }

    /*
     * WARNING - void declaration
     */
    public sprgle(InputStream inputStream, int n, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprgle sprgle2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_953 = arg1;
        sprgle2.cfr_renamed_4 = arg2;
        sprgle2.cfr_renamed_3 = new byte[11][];
    }

    public sprgle(InputStream arg0, int arg1) {
        this(arg0, arg1, false);
    }

    public static int cfr_renamed_4918(InputStream arg0, int arg1) throws IOException {
        int n = arg0.read();
        if (n < 0) {
            throw new EOFException(sprpcka.cfr_renamed_9("xn{\u0001[NHOY\u0001JIXO\u001dMXOZUU\u0001XYMD^UXE"));
        }
        if (n == 128) {
            return -1;
        }
        if (n > 127) {
            int n2;
            int n3 = n & 0x7F;
            if (n3 > 4) {
                throw new IOException(new StringBuilder().insert(0, spruuc.cfr_renamed_9("5,#I\u001d\f\u001f\u000e\u0005\u0001Q\u0004\u001e\u001b\u0014I\u0005\u0001\u0010\u0007Q]Q\u000b\b\u001d\u0014\u001aKI")).append(n3).toString());
            }
            n = 0;
            int n4 = n2 = 0;
            while (n4 < n3) {
                int n5 = arg0.read();
                if (n5 < 0) {
                    throw new EOFException(sprpcka.cfr_renamed_9("xn{\u0001[NHOY\u0001OD\\ETOZ\u0001QDSFII"));
                }
                n = (n << 8) + n5;
                n4 = ++n2;
            }
            if (n < 0) {
                throw new IOException(spruuc.cfr_renamed_9("\u0012\u0006\u0003\u001b\u0004\u0019\u0005\f\u0015I\u0002\u001d\u0003\f\u0010\u0004QDQ\u0007\u0014\u000e\u0010\u001d\u0018\u001f\u0014I\u001d\f\u001f\u000e\u0005\u0001Q\u000f\u001e\u001c\u001f\r"));
            }
            if (n >= arg1) {
                throw new IOException(sprpcka.cfr_renamed_9("BRSOTMUXE\u001dRISX@P\u0001\u0010\u0001RTI\u0001RG\u001dCRTSEN\u0001QDSFII\u001dGRTSE"));
            }
        }
        return n;
    }
}

