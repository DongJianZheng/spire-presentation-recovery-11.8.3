/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlny;
import com.spire.presentation.packages.spruzy;
import com.spire.presentation.packages.sprvj;

public class sprfne {
    public int cfr_renamed_2;
    public sprvj cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) {
        int n = 0;
        this.cfr_renamed_4[this.cfr_renamed_2++] = arg0;
        sprfne sprfne2 = this;
        if (sprfne2.cfr_renamed_2 == sprfne2.cfr_renamed_4.length) {
            sprfne sprfne3 = this;
            n = sprfne3.cfr_renamed_3.cfr_renamed_499(sprfne3.cfr_renamed_4, 0, this.cfr_renamed_4.length, arg1, arg2);
            this.cfr_renamed_2 = 0;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprfne(sprvj sprvj2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (n % arg0.cfr_renamed_2() != 0) {
            throw new IllegalArgumentException(sprlny.cfr_renamed_9("\"\u001a&\t%\u001d`\u001c)\u0015%O.\u00004O-\u001a,\u001b)\u001f,\n`\u0000&O)\u00010\u001a4O\"\u0003/\f+O3\u0006:\n"));
        }
        this.cfr_renamed_4 = new byte[arg1];
        this.cfr_renamed_2 = 0;
    }

    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(spruzy.cfr_renamed_9("H\u0004eB\u007fEc\u0004}\u0000+\u0004+\u000bn\u0002j\u0011b\u0013nEb\u000b{\u0010\u007fEg\u0000e\u0002\u007f\r*"));
        }
        int n = 0;
        int n2 = this.cfr_renamed_4.length - this.cfr_renamed_2;
        if (arg2 > n2) {
            sprfne sprfne2 = this;
            System.arraycopy(arg0, arg1, sprfne2.cfr_renamed_4, sprfne2.cfr_renamed_2, n2);
            sprfne sprfne3 = this;
            n += sprfne3.cfr_renamed_3.cfr_renamed_499(sprfne3.cfr_renamed_4, 0, this.cfr_renamed_4.length, arg3, arg4);
            this.cfr_renamed_2 = 0;
            arg4 += n;
            int n3 = arg2 -= n2;
            int n4 = n3 - n3 % this.cfr_renamed_4.length;
            n += this.cfr_renamed_3.cfr_renamed_499(arg0, arg1 += n2, n4, arg3, arg4);
            arg2 -= n4;
            arg1 += n4;
        }
        if (arg2 != 0) {
            sprfne sprfne4 = this;
            System.arraycopy(arg0, arg1, sprfne4.cfr_renamed_4, this.cfr_renamed_2, arg2);
            sprfne4.cfr_renamed_2 += arg2;
        }
        return n;
    }
}

