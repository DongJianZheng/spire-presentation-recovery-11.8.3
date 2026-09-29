/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprame;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprcwc;
import com.spire.presentation.packages.sprgny;
import com.spire.presentation.packages.spriad;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.spryc;
import com.spire.presentation.packages.sprzaq;
import java.io.IOException;
import java.io.OutputStream;

public class sprzbd {
    private sprame cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_2569(spryc arg0) throws spriad {
        try {
            spryc spryc2 = arg0;
            OutputStream outputStream = spryc2.cfr_renamed_470();
            sprzbd sprzbd2 = this;
            outputStream.write(sprzbd2.cfr_renamed_4.cfr_renamed_2570().cfr_renamed_104("DER"));
            outputStream.close();
            return spryc2.cfr_renamed_1435(sprzbd2.cfr_renamed_4.cfr_renamed_2571());
        }
        catch (Exception exception) {
            throw new spriad(new StringBuilder().insert(0, sprzaq.cfr_renamed_9("O\u0003[\u000fV\b\u001a\u0019UMJ\u001fU\u000e_\u001eIMI\u0004]\u0003[\u0019O\u001f_W\u001a")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprame cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprame.cfr_renamed_23(arg0);
        }
        catch (ClassCastException classCastException) {
            throw new sprcwc(new StringBuilder().insert(0, sprgny.cfr_renamed_9("a\u000e`\tc\u001da\nhOh\u000ex\u000e6O")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprcwc(new StringBuilder().insert(0, sprzaq.cfr_renamed_9("\u0000[\u0001\\\u0002H\u0000_\t\u001a\t[\u0019[W\u001a")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (spraqe spraqe2) {
            if (spraqe2.getCause() instanceof IOException) {
                throw (IOException)spraqe2.getCause();
            }
            throw new sprcwc(new StringBuilder().insert(0, sprgny.cfr_renamed_9("a\u000e`\tc\u001da\nhOh\u000ex\u000e6O")).append(spraqe2.getMessage()).toString(), spraqe2);
        }
    }

    public sprame cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprzbd(sprame sprame2) {
        this.cfr_renamed_4 = sprame2;
    }

    public sprvae cfr_renamed_2572() {
        return this.cfr_renamed_4.cfr_renamed_1157();
    }

    public sprzbd(byte[] arg0) throws IOException {
        this(sprzbd.cfr_renamed_1443(arg0));
    }
}

