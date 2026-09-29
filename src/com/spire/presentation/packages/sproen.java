/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceaa;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhfn;
import com.spire.presentation.packages.sprkop;
import com.spire.presentation.packages.sprubn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.OutputStream;

public class sproen {
    private OutputStream cfr_renamed_4;

    public static int cfr_renamed_11214(boolean arg0, int arg1) {
        int n;
        int n2;
        if (arg0) {
            n2 = 1;
            n = arg1;
        } else {
            n2 = 0;
            n = arg1;
        }
        return n2 + sproen.cfr_renamed_11275(n) + arg1;
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11495(boolean bl, int n, int n2, byte[] byArray) throws IOException {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sproen sproen2 = this;
        sproen2.cfr_renamed_11280((boolean)arg0, (int)arg1, (int)arg2);
        sproen2.cfr_renamed_11281(byArray.length);
        void v1 = arg3;
        this.cfr_renamed_4924((byte[])v1, 0, ((void)v1).length);
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11300(boolean bl, int n, byte by, byte[] byArray, int n2, int n3) throws IOException {
        void arg4;
        void arg2;
        void arg5;
        void arg1;
        void arg0;
        sproen sproen2 = this;
        sproen sproen3 = this;
        sproen3.cfr_renamed_11285((boolean)arg0, (int)arg1);
        sproen3.cfr_renamed_11281(1 + arg5);
        sproen2.cfr_renamed_4787((int)arg2);
        sproen2.cfr_renamed_4924(byArray, (int)arg4, (int)arg5);
    }

    public final void cfr_renamed_9373(sprxgf arg0) throws IOException {
        if (null == arg0) {
            throw new IOException(sprkop.cfr_renamed_9("<Y>@rC0F7O&\f6I&I1X7H"));
        }
        sproen sproen2 = this;
        sproen2.cfr_renamed_11286(arg0, true);
        sproen2.cfr_renamed_11493();
    }

    public final void cfr_renamed_4787(int arg0) throws IOException {
        this.cfr_renamed_4.write(arg0);
    }

    public sprhfn cfr_renamed_4785() {
        return new sprhfn(this.cfr_renamed_4);
    }

    public final void cfr_renamed_5102(sprco arg0) throws IOException {
        if (null == arg0) {
            throw new IOException(sprceaa.cfr_renamed_9("@\u001cB\u0005\u000e\u0006L\u0003K\nZIJ\fZ\fM\u001dK\r"));
        }
        sproen sproen2 = this;
        sproen2.cfr_renamed_11286(arg0.cfr_renamed_119(), true);
        sproen2.cfr_renamed_11493();
    }

    public static int cfr_renamed_11276(int arg0) {
        if (arg0 < 31) {
            return 1;
        }
        int n = 2;
        int n2 = arg0;
        while ((arg0 = n2 >>> 7) != 0) {
            n2 = arg0;
            ++n;
        }
        return n;
    }

    public final void cfr_renamed_11281(int arg0) throws IOException {
        if (arg0 < 128) {
            this.cfr_renamed_4787(arg0);
            return;
        }
        byte[] byArray = new byte[5];
        int n = byArray.length;
        do {
            byArray[--n] = (byte)arg0;
        } while ((arg0 >>>= 8) != 0);
        int n2 = byArray.length - n;
        int n3 = n2;
        byArray[--n] = (byte)(0x80 | n3);
        this.cfr_renamed_4924(byArray, n, n3 + 1);
    }

    public void cfr_renamed_11493() throws IOException {
    }

    public final void cfr_renamed_11285(boolean arg0, int arg1) throws IOException {
        if (arg0) {
            this.cfr_renamed_4787(arg1);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11429(boolean bl, int n, sprco[] sprcoArray) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        sproen sproen2 = this;
        sproen sproen3 = this;
        this.cfr_renamed_11285((boolean)arg0, (int)arg1);
        sproen3.cfr_renamed_4787(128);
        sproen3.cfr_renamed_11293((sprco[])arg2);
        sproen2.cfr_renamed_4787(0);
        sproen2.cfr_renamed_4787(0);
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11310(boolean bl, int n, byte[] byArray, int n2, int n3, byte by) throws IOException {
        void arg3;
        void arg2;
        void arg4;
        void arg1;
        void arg0;
        sproen sproen2 = this;
        sproen sproen3 = this;
        sproen3.cfr_renamed_11285((boolean)arg0, (int)arg1);
        sproen3.cfr_renamed_11281((int)(arg4 + true));
        sproen2.cfr_renamed_4924((byte[])arg2, (int)arg3, (int)arg4);
        sproen2.cfr_renamed_4787(by);
    }

    public final void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.write(arg0, arg1, arg2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3;
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

    public static sproen cfr_renamed_11494(OutputStream arg0, String arg1) {
        if (arg1.equals("DER")) {
            return new sprubn(arg0);
        }
        if (arg1.equals("DL")) {
            return new sprhfn(arg0);
        }
        return new sproen(arg0);
    }

    public static int cfr_renamed_11275(int arg0) {
        if (arg0 < 128) {
            return 1;
        }
        int n = 2;
        int n2 = arg0;
        while ((arg0 = n2 >>> 8) != 0) {
            n2 = arg0;
            ++n;
        }
        return n;
    }

    public static sproen cfr_renamed_5101(OutputStream arg0) {
        return new sproen(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11496(boolean bl, int n, byte by) throws IOException {
        void arg1;
        void arg0;
        sproen sproen2 = this;
        this.cfr_renamed_11285((boolean)arg0, (int)arg1);
        sproen2.cfr_renamed_11281(1);
        sproen2.cfr_renamed_4787(by);
    }

    public final void cfr_renamed_11280(boolean arg0, int arg1, int arg2) throws IOException {
        if (!arg0) {
            return;
        }
        if (arg2 < 31) {
            this.cfr_renamed_4787(arg1 | arg2);
            return;
        }
        byte[] byArray = new byte[6];
        int n = byArray.length;
        byArray[--n] = (byte)(arg2 & 0x7F);
        int n2 = arg2;
        while (n2 > 127) {
            byArray[--n] = (byte)((arg2 >>>= 7) & 0x7F | 0x80);
            n2 = arg2;
        }
        byArray[--n] = (byte)(arg1 | 0x1F);
        this.cfr_renamed_4924(byArray, n, byArray.length - n);
    }

    public sproen(OutputStream outputStream) {
        this.cfr_renamed_4 = outputStream;
    }

    public void cfr_renamed_11292(sprxgf[] arg0) throws IOException {
        int n = 0;
        int n2 = arg0.length;
        int n3 = n;
        while (n3 < n2) {
            sprxgf sprxgf2 = arg0[n];
            sprxgf2.cfr_renamed_11218(this, true);
            n3 = ++n;
        }
    }

    public void cfr_renamed_11293(sprco[] arg0) throws IOException {
        int n = 0;
        int n2 = arg0.length;
        int n3 = n;
        while (n3 < n2) {
            sprxgf sprxgf2 = arg0[n].cfr_renamed_119();
            sprxgf2.cfr_renamed_11218(this, true);
            n3 = ++n;
        }
    }

    public sprubn cfr_renamed_4790() {
        return new sprubn(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11219(boolean bl, int n, byte[] byArray) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        sproen sproen2 = this;
        sproen2.cfr_renamed_11285((boolean)arg0, (int)arg1);
        sproen2.cfr_renamed_11281(byArray.length);
        void v1 = arg2;
        this.cfr_renamed_4924((byte[])v1, 0, ((void)v1).length);
    }

    public void cfr_renamed_2947() throws IOException {
        this.cfr_renamed_4.flush();
    }

    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_4.close();
    }

    public void cfr_renamed_11286(sprxgf arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11218(this, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public final void cfr_renamed_11298(boolean bl, int n, byte[] byArray, int n2, int n3) throws IOException {
        void arg3;
        void arg4;
        void arg1;
        void arg0;
        sproen sproen2 = this;
        this.cfr_renamed_11285((boolean)arg0, (int)arg1);
        sproen2.cfr_renamed_11281((int)arg4);
        sproen2.cfr_renamed_4924(byArray, (int)arg3, (int)arg4);
    }
}

