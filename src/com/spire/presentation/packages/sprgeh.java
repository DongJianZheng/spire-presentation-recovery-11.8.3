/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.sprwcs;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprgeh
extends FilterInputStream {
    @Override
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        int n2;
        block3: {
            int n3 = n2 = 0;
            while (n3 != arg2) {
                int n4 = this.read();
                if (n4 < 0) {
                    n = n2;
                    break block3;
                }
                int n5 = n2 + arg1;
                arg0[n5] = (byte)n4;
                n3 = ++n2;
            }
            n = n2;
        }
        if (n == 0) {
            return -1;
        }
        return n2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprgeh(InputStream arg0) {
        super(arg0);
    }

    @Override
    public int read() throws IOException {
        int n = this.in.read();
        if (n == -1) {
            return -1;
        }
        int n2 = n;
        while (n2 == 61) {
            int n3;
            int n4 = this.in.read();
            if (n4 == -1) {
                throw new IllegalStateException(sprcmn.cfr_renamed_9("B/|.v>3}.}3;gzv4wz|<3)g(v;~"));
            }
            if (n4 == 13) {
                n4 = this.in.read();
                if (n4 == 10) {
                    n4 = this.in.read();
                }
                n2 = n4;
                continue;
            }
            if (n4 == 10) {
                n2 = this.in.read();
                continue;
            }
            int n5 = 0;
            if (n4 >= 48 && n4 <= 57) {
                n3 = n5 = n4 - 48;
            } else if (n4 >= 65 && n4 <= 70) {
                n3 = n5 = 10 + (n4 - 65);
            } else {
                throw new IllegalStateException(sprwcs.cfr_renamed_9("6V\u0003K\u0010Z\u001a@\u0014\u000eT\u001eB\u001c@\u001aF\u0018D\u0016Jo1m7k5\u000e\u0012H\u0007K\u0001\u000e\u0002[\u001cZ\u0016\u000e\u0007F\u0012ZSY\u0012]S@\u001cZSG\u001eC\u0016J\u001aO\u0007K\u001fWSH\u001cB\u001fA\u0004K\u0017\u000e\u0011WSb5\u000e\u001c\\Sm!b5"));
            }
            n5 = n3 << 4;
            n4 = this.in.read();
            if (n4 >= 48 && n4 <= 57) {
                return n5 |= n4 - 48;
            }
            if (n4 >= 65 && n4 <= 70) {
                return n5 |= 10 + (n4 - 65);
            }
            throw new IllegalStateException(sprcmn.cfr_renamed_9("\u001fk*v9g3}=3)v9|4wz4j\"h n&l$b*\u001bQ\u0019W\u001fUzr<g?azb/|.vzg2r.3-r)34|.33~7v>z;g?\u007f#3<|6\u007f5d?wzq#3\u0016Uz|(3\u0019A\u0016U"));
        }
        return n;
    }
}

