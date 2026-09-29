/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjn;
import java.io.ByteArrayOutputStream;

public class sprutf {
    private final ByteArrayOutputStream cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_6522(sprjn[] arg0) {
        try {
            sprjn[] sprjnArray = arg0;
            int n = arg0.length;
            for (int i = 0; i < n; ++i) {
                sprjn sprjn2 = sprjnArray[i];
                this.cfr_renamed_4.write(sprjn2.cfr_renamed_91());
            }
            return this;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    public sprutf cfr_renamed_6451(int arg0, int arg1) {
        sprutf sprutf2 = this;
        while (sprutf2.cfr_renamed_4.size() < arg1) {
            sprutf sprutf3 = this;
            sprutf2 = sprutf3;
            sprutf3.cfr_renamed_4.write(arg0);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_5941(sprjn arg0) {
        try {
            this.cfr_renamed_4.write(arg0.cfr_renamed_91());
            return this;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_6450(byte[] arg0) {
        try {
            this.cfr_renamed_4.write(arg0);
            return this;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_6471(byte[][] arg0) {
        try {
            byte[][] byArray = arg0;
            int n = arg0.length;
            for (int i = 0; i < n; ++i) {
                byte[] byArray2 = byArray[i];
                this.cfr_renamed_4.write(byArray2);
            }
            return this;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    public sprutf cfr_renamed_6458(int arg0) {
        sprutf sprutf2 = this;
        sprutf2.cfr_renamed_4.write((byte)((arg0 &= 0xFFFF) >>> 8));
        sprutf2.cfr_renamed_4.write((byte)arg0);
        return sprutf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_6523(byte[] arg0, int arg1, int arg2) {
        try {
            this.cfr_renamed_4.write(arg0, arg1, arg2);
            return this;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    public sprutf cfr_renamed_6514(boolean arg0) {
        this.cfr_renamed_4.write(arg0 ? 1 : 0);
        return this;
    }

    public byte[] cfr_renamed_1451() {
        return this.cfr_renamed_4.toByteArray();
    }

    private /* synthetic */ sprutf() {
        sprutf sprutf2 = this;
        sprutf2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_6524(byte[][] arg0, int arg1, int arg2) {
        try {
            int n = arg1;
            while (n != arg2) {
                this.cfr_renamed_4.write(arg0[n++]);
            }
            return this;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    public static sprutf cfr_renamed_5939() {
        return new sprutf();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4;
        int cfr_ignored_0 = 5 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 3);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprutf cfr_renamed_6525(int arg0, int arg1) {
        int n = arg1;
        while (n >= 0) {
            try {
                this.cfr_renamed_4.write(arg0);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.getMessage(), exception);
            }
            n = --arg1;
        }
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprutf cfr_renamed_6513(long l) {
        void arg0;
        sprutf sprutf2 = this;
        this.cfr_renamed_5940((int)(l >>> 32));
        sprutf2.cfr_renamed_5940((int)arg0);
        return sprutf2;
    }

    public sprutf cfr_renamed_5940(int arg0) {
        sprutf sprutf2 = this;
        sprutf2.cfr_renamed_4.write((byte)(arg0 >>> 24));
        sprutf2.cfr_renamed_4.write((byte)(arg0 >>> 16));
        sprutf2.cfr_renamed_4.write((byte)(arg0 >>> 8));
        sprutf2.cfr_renamed_4.write((byte)arg0);
        return sprutf2;
    }
}

