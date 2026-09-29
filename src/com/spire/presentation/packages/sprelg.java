/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboe;
import com.spire.presentation.packages.sprcle;
import com.spire.presentation.packages.sprcoca;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprng;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprwr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprelg
implements sprng {
    public static final sprlem cfr_renamed_31;
    public static final sprlem cfr_renamed_272;
    public static final sprddm cfr_renamed_145;
    public static final sprddm cfr_renamed_114;
    public static final sprddm cfr_renamed_96;
    public static final sprlem cfr_renamed_105;
    public static final sprddm cfr_renamed_137;
    private sprcom cfr_renamed_79;
    public static final sprlem cfr_renamed_107;
    private sprmh cfr_renamed_132;
    public static final sprddm cfr_renamed_102;
    public static final sprddm cfr_renamed_93;
    public static final sprlem cfr_renamed_86;
    public static final sprddm cfr_renamed_152;
    public static final sprddm cfr_renamed_112;
    public static final sprddm cfr_renamed_119;
    public static final sprlem cfr_renamed_91;
    public static final sprlem cfr_renamed_0;
    public static final sprlem cfr_renamed_1;
    public static final sprlem cfr_renamed_2;
    public static final sprddm cfr_renamed_3;
    public static final sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprelg(sprcom sprcom2, sprmh sprmh2) {
        void arg0;
        sprelg sprelg2 = this;
        sprelg2.cfr_renamed_79 = arg0;
        sprelg2.cfr_renamed_132 = sprmh2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprcle cfr_renamed_7496(sprcom arg0, sprmh arg1) throws sprboe {
        try {
            byte[] byArray = arg0.cfr_renamed_91();
            if (arg1 == null) {
                return new sprcle("PRIVATE KEY", byArray);
            }
        }
        catch (IOException iOException) {
            throw new sprboe(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("\u0001T\u0015X\u0018_TN\u001b\u001a\u0004H\u001bY\u0011I\u0007\u001a\u0011T\u0017U\u0010_\u0010\u001a\u001f_\r\u001a\u0010[\u0000[N\u001a")).append(iOException.getMessage()).toString(), iOException);
        }
        {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = arg1.cfr_renamed_1442(byteArrayOutputStream);
            outputStream.write(arg0.cfr_renamed_91());
            outputStream.close();
            sprllm sprllm2 = new sprllm(arg1.cfr_renamed_615(), byteArrayOutputStream.toByteArray());
            return new sprcle("ENCRYPTED PRIVATE KEY", sprllm2.cfr_renamed_91());
        }
    }

    @Override
    public sprcle cfr_renamed_31() throws sprboe {
        if (this.cfr_renamed_132 != null) {
            sprelg sprelg2 = this;
            return sprelg2.cfr_renamed_7496(this.cfr_renamed_79, sprelg2.cfr_renamed_132);
        }
        sprelg sprelg3 = this;
        return sprelg3.cfr_renamed_7496(sprelg3.cfr_renamed_79, null);
    }

    static {
        cfr_renamed_0 = sprwr.cfr_renamed_88;
        cfr_renamed_91 = sprwr.cfr_renamed_1223;
        cfr_renamed_105 = sprwr.cfr_renamed_724;
        cfr_renamed_86 = sprdl.cfr_renamed_2797;
        cfr_renamed_2 = sprdl.cfr_renamed_272;
        cfr_renamed_4 = sprdl.cfr_renamed_1454;
        cfr_renamed_272 = sprdl.cfr_renamed_954;
        cfr_renamed_107 = sprdl.cfr_renamed_805;
        cfr_renamed_31 = sprdl.cfr_renamed_1260;
        cfr_renamed_1 = sprdl.cfr_renamed_2;
        cfr_renamed_119 = new sprddm(sprdl.cfr_renamed_1763, sprpen.cfr_renamed_4);
        cfr_renamed_96 = new sprddm(sprdl.cfr_renamed_3240, sprpen.cfr_renamed_4);
        cfr_renamed_112 = new sprddm(sprdl.cfr_renamed_131, sprpen.cfr_renamed_4);
        cfr_renamed_152 = new sprddm(sprdl.cfr_renamed_1223, sprpen.cfr_renamed_4);
        cfr_renamed_93 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
        cfr_renamed_102 = new sprddm(sprqo.cfr_renamed_4, sprpen.cfr_renamed_4);
        cfr_renamed_137 = new sprddm(sprwr.cfr_renamed_105, sprpen.cfr_renamed_4);
        cfr_renamed_3 = new sprddm(sprwr.cfr_renamed_728, sprpen.cfr_renamed_4);
        cfr_renamed_114 = new sprddm(sprwr.cfr_renamed_145, sprpen.cfr_renamed_4);
        cfr_renamed_145 = new sprddm(sprwr.cfr_renamed_119, sprpen.cfr_renamed_4);
    }
}

