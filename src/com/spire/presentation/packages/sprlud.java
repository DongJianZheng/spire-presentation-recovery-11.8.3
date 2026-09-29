/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprknp;
import com.spire.presentation.packages.sprkte;
import com.spire.presentation.packages.sprla;
import com.spire.presentation.packages.sprmaaa;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.spron;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzod;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprlud {
    private spron cfr_renamed_2;
    private sproa cfr_renamed_3;
    private sprla cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkte cfr_renamed_1560(sprcyd arg0) throws sprzod {
        try {
            sprlud sprlud2 = this;
            return sprlud2.cfr_renamed_4365(sprlud2.cfr_renamed_4366(arg0.cfr_renamed_91()));
        }
        catch (IOException iOException) {
            throw new sprzod(new StringBuilder().insert(0, sprknp.cfr_renamed_9("wEzJ{P4AzG{@q\u0004wAfP}B}GuPq\u001e4")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprlud(sprla arg0, sproa arg1) {
        this(arg0, arg1, null);
    }

    private /* synthetic */ byte[] cfr_renamed_4366(byte[] arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_3250(arg0);
        }
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprlud(sprla sprla2, sproa sproa2, spron spron2) {
        void arg1;
        void arg0;
        sprlud sprlud2 = this;
        this.cfr_renamed_4 = arg0;
        sprlud2.cfr_renamed_3 = arg1;
        sprlud2.cfr_renamed_2 = spron2;
    }

    public sprkte cfr_renamed_1480(char[] arg0) throws sprzod {
        sprlud sprlud2 = this;
        return sprlud2.cfr_renamed_4365(sprlud2.cfr_renamed_4366(sprywa.cfr_renamed_432(arg0)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprkte cfr_renamed_4365(byte[] arg0) throws sprzod {
        sprmra sprmra2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStream = this.cfr_renamed_3.cfr_renamed_1442(byteArrayOutputStream);
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(arg0);
            outputStream2.close();
        }
        catch (IOException iOException) {
            throw new sprzod(new StringBuilder().insert(0, sprmaaa.cfr_renamed_9("f\u0010k\u001fj\u0005%\u0001w\u001ef\u0014v\u0002%\u0015d\u0005dK%")).append(iOException.getMessage()).toString(), iOException);
        }
        sprije sprije2 = null;
        sprije sprije3 = this.cfr_renamed_3.cfr_renamed_615();
        try {
            sprlud sprlud2 = this;
            sprlud2.cfr_renamed_4.cfr_renamed_1533(sprlud2.cfr_renamed_3.cfr_renamed_1521());
            sprlud sprlud3 = this;
            sprmra2 = new sprmra(sprlud3.cfr_renamed_4.cfr_renamed_1533(sprlud3.cfr_renamed_3.cfr_renamed_1521()));
        }
        catch (sprmfb sprmfb2) {
            throw new sprzod(new StringBuilder().insert(0, sprknp.cfr_renamed_9("wEzJ{P4SfEd\u0004\u007fAm\u001e4")).append(sprmfb2.getMessage()).toString(), sprmfb2);
        }
        sprije sprije4 = this.cfr_renamed_4.cfr_renamed_615();
        sprxue sprxue2 = null;
        sprmra sprmra3 = new sprmra(byteArrayOutputStream.toByteArray());
        return new sprkte(sprije2, sprije3, sprmra2, sprije4, sprxue2, sprmra3);
    }
}

