/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprnraa;
import com.spire.presentation.packages.sprpi;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.spryqp;
import java.io.IOException;
import java.io.InputStream;

public class sprqvc
implements sprpi {
    private sprqid cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public sprhgb cfr_renamed_3338(InputStream arg0) throws IOException {
        byte[] byArray;
        int n = arg0.read();
        switch (n) {
            case 0: {
                throw new IOException(spryqp.cfr_renamed_9("+{\u0016z\u001dl_mXn\r|\u0014w\u001b>\u0013{\u0001>\u0011p\u000e\u007f\u0014w\u001c0"));
            }
            case 2: 
            case 3: {
                byte[] byArray2 = byArray = new byte[1 + (this.cfr_renamed_4.cfr_renamed_1769().cfr_renamed_1938() + 7) / 8];
                break;
            }
            case 4: 
            case 6: 
            case 7: {
                byte[] byArray2 = byArray = new byte[1 + 2 * ((this.cfr_renamed_4.cfr_renamed_1769().cfr_renamed_1938() + 7) / 8)];
                break;
            }
            default: {
                throw new IOException(new StringBuilder().insert(0, sprnraa.cfr_renamed_9("\r[0Z;LyM~N+\\2W=\u001e5['\u001e6_-\u001e7P(_2W:\u001e.Q7P*\u001e;P=Q:W0Y~\u000e&")).append(Integer.toString(n, 16)).toString());
            }
        }
        byArray2[0] = (byte)n;
        arg0.read(byArray, 1, byArray.length - 1);
        return new sprwmd(this.cfr_renamed_4.cfr_renamed_1769().cfr_renamed_2002(byArray), this.cfr_renamed_4);
    }

    public sprqvc(sprqid sprqid2) {
        this.cfr_renamed_4 = sprqid2;
    }
}

