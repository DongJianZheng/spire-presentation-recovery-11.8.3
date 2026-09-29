/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbe;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprfpf;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprpva;
import com.spire.presentation.packages.sprq;
import com.spire.presentation.packages.sprqla;
import com.spire.presentation.packages.sprtzd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprjgb
implements sprq {
    public static final sprtzd cfr_renamed_102;
    public static final sprtzd cfr_renamed_93;
    private sproa cfr_renamed_86;
    public static final sprtzd cfr_renamed_152;
    public static final sprtzd cfr_renamed_112;
    public static final sprtzd cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    public static final sprtzd cfr_renamed_2;
    private sprmke cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjgb(sprmke sprmke2, sproa sproa2) {
        void arg0;
        sprjgb sprjgb2 = this;
        sprjgb2.cfr_renamed_3 = arg0;
        sprjgb2.cfr_renamed_86 = sproa2;
    }

    @Override
    public sprpva cfr_renamed_31() throws sprqla {
        if (this.cfr_renamed_86 != null) {
            sprjgb sprjgb2 = this;
            return sprjgb2.cfr_renamed_1590(this.cfr_renamed_3, sprjgb2.cfr_renamed_86);
        }
        sprjgb sprjgb3 = this;
        return sprjgb3.cfr_renamed_1590(sprjgb3.cfr_renamed_3, null);
    }

    static {
        cfr_renamed_0 = sprdg.cfr_renamed_287;
        cfr_renamed_1 = sprdg.cfr_renamed_152;
        cfr_renamed_93 = sprdg.cfr_renamed_102;
        cfr_renamed_4 = sprm.cfr_renamed_1262;
        cfr_renamed_112 = sprm.cfr_renamed_813;
        cfr_renamed_91 = sprm.cfr_renamed_1480;
        cfr_renamed_152 = sprm.cfr_renamed_805;
        cfr_renamed_2 = sprm.cfr_renamed_613;
        cfr_renamed_119 = sprm.cfr_renamed_119;
        cfr_renamed_102 = sprm.cfr_renamed_1512;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprpva cfr_renamed_1590(sprmke arg0, sproa arg1) throws sprqla {
        try {
            byte[] byArray = arg0.cfr_renamed_91();
            if (arg1 == null) {
                return new sprpva("PRIVATE KEY", byArray);
            }
        }
        catch (IOException iOException) {
            throw new sprqla(new StringBuilder().insert(0, sprfpf.cfr_renamed_9("v,b o'#6lbs0l!f1pbf,`-g'gbh'zbg#w#9b")).append(iOException.getMessage()).toString(), iOException);
        }
        {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = arg1.cfr_renamed_1442(byteArrayOutputStream);
            outputStream.write(arg0.cfr_renamed_91());
            outputStream.close();
            sprbbe sprbbe2 = new sprbbe(arg1.cfr_renamed_615(), byteArrayOutputStream.toByteArray());
            return new sprpva("ENCRYPTED PRIVATE KEY", sprbbe2.cfr_renamed_91());
        }
    }
}

