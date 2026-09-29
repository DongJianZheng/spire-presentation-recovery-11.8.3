/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprejy;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrs;
import com.spire.presentation.packages.spruaka;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.InputStream;

public class sprtik
implements sprrs {
    private sprqxk cfr_renamed_4;

    public sprtik(sprqxk sprqxk2) {
        this.cfr_renamed_4 = sprqxk2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public spryye cfr_renamed_3338(InputStream arg0) throws IOException {
        byte[] byArray;
        int n = arg0.read();
        switch (n) {
            case 0: {
                throw new IOException(sprejy.cfr_renamed_9(":\u0012\u0007\u0013\f\u0005N\u0004I\u0007\u001c\u0015\u0005\u001e\nW\u0002\u0012\u0010W\u0000\u0019\u001f\u0016\u0005\u001e\rY"));
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
                throw new IOException(new StringBuilder().insert(0, spruaka.cfr_renamed_9("*\u0006\u0017\u0007\u001c\u0011^\u0010Y\u0013\f\u0001\u0015\n\u001aC\u0012\u0006\u0000C\u0011\u0002\nC\u0010\r\u000f\u0002\u0015\n\u001dC\t\f\u0010\r\rC\u001c\r\u001a\f\u001d\n\u0017\u0004YS\u0001")).append(Integer.toString(n, 16)).toString());
            }
        }
        byArray2[0] = (byte)n;
        sprkqe.cfr_renamed_473(arg0, byArray, 1, byArray.length - 1);
        return new sprnzk(this.cfr_renamed_4.cfr_renamed_1769().cfr_renamed_2002(byArray), this.cfr_renamed_4);
    }
}

