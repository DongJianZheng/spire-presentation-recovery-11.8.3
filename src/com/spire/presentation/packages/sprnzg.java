/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprttc;
import com.spire.presentation.pdf.security.PdfSecurity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprnzg {
    private static final byte[] cfr_renamed_2 = sprfqe.cfr_renamed_488(sprttc.cfr_renamed_9("\\{^\u000f^\f^\u000f_s^\u000e^\f_\u007f_yZz]y^\u007f^\u000f^~^\u007f_xZzZzZzZz"));
    private final sprsm cfr_renamed_3;
    private final int cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_7878(sprsm arg0, spreuh arg1, int arg2, byte[] arg3) throws IOException {
        OutputStream outputStream;
        byte[] byArray = arg1.cfr_renamed_1969().cfr_renamed_91();
        sprsm sprsm2 = arg0;
        OutputStream outputStream2 = outputStream = sprsm2.cfr_renamed_470();
        OutputStream outputStream3 = outputStream;
        OutputStream outputStream4 = outputStream;
        outputStream4.write(0);
        outputStream4.write(0);
        outputStream3.write(0);
        outputStream3.write(1);
        outputStream2.write(byArray);
        outputStream2.write(arg3);
        byte[] byArray2 = sprsm2.cfr_renamed_580();
        byte[] byArray3 = new byte[arg2];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
        return byArray3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_7879(sprlem arg0, spreuh arg1, byte[] arg2) throws sprtqg {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byArray = arg0.cfr_renamed_91();
            byteArrayOutputStream.write(byArray, 1, byArray.length - 1);
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            sprnzg sprnzg2 = this;
            ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
            byteArrayOutputStream.write(18);
            byteArrayOutputStream3.write(3);
            byteArrayOutputStream3.write(1);
            byteArrayOutputStream.write(sprnzg2.cfr_renamed_3.cfr_renamed_593());
            byteArrayOutputStream2.write(sprnzg2.cfr_renamed_4);
            byteArrayOutputStream2.write(cfr_renamed_2);
            byteArrayOutputStream2.write(arg2);
            return sprnzg.cfr_renamed_7878(this.cfr_renamed_3, arg1, sprnzg.cfr_renamed_7880(this.cfr_renamed_4), byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, sprttc.cfr_renamed_9("-2\u000b/\u0018>\u0001%\u0006j\u0018/\u001a,\u00078\u0005#\u0006-H\u0001,\fRj")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_7880(int arg0) throws sprtqg {
        switch (arg0) {
            case 7: {
                return 16;
            }
            case 8: {
                return 24;
            }
            case 9: {
                return 32;
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, PdfSecurity.cfr_renamed_9("\u0012\u0019\f\u0019\b\u0000\tW\u0014\u000e\n\u001a\u0002\u0003\u0015\u001e\u0004W\u0006\u001b\u0000\u0018\u0015\u001e\u0013\u001f\nW.3]W")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprnzg(sprsm sprsm2, int n) {
        void arg0;
        sprnzg sprnzg2 = this;
        sprnzg2.cfr_renamed_3 = arg0;
        sprnzg2.cfr_renamed_4 = n;
    }
}

