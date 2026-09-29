/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprsso {
    private byte cfr_renamed_3 = 1;
    private int cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17303(boolean arg0) {
        this.cfr_renamed_3 = (byte)(this.cfr_renamed_3 & 0xFF & 0xFB | (arg0 ? 1 : 0) << 2);
    }

    @sprtea
    public void cfr_renamed_17304(boolean arg0) {
        this.cfr_renamed_3 = (byte)(this.cfr_renamed_3 & 0xFF & 0xEF | (arg0 ? 1 : 0) << 4);
    }

    @sprtea
    public void cfr_renamed_17305(boolean arg0) {
        this.cfr_renamed_3 = (byte)(this.cfr_renamed_3 & 0xFF & 0xBF | (arg0 ? 1 : 0) << 6);
    }

    @sprtea
    public boolean cfr_renamed_15533() {
        return (this.cfr_renamed_3 & 0xFF & 0x40) >> 6 != 0;
    }

    @sprtea
    public void cfr_renamed_17306(boolean arg0) {
        this.cfr_renamed_3 = (byte)(this.cfr_renamed_3 & 0xFF & 0xF7 | (arg0 ? 1 : 0) << 3);
    }

    @sprtea
    public boolean cfr_renamed_17307() {
        return (this.cfr_renamed_3 & 0xFF & 8) >> 3 != 0;
    }

    @sprtea
    public void cfr_renamed_17308(boolean arg0) {
        this.cfr_renamed_3 = (byte)(this.cfr_renamed_3 & 0xFF & 0xFD | (arg0 ? 1 : 0) << 1);
    }

    @sprtea
    public sprsso cfr_renamed_12099() {
        sprsso sprsso2;
        sprsso sprsso3 = sprsso2 = new sprsso();
        sprsso sprsso4 = this;
        sprsso sprsso5 = sprsso2;
        sprsso sprsso6 = this;
        sprsso2.cfr_renamed_17305(sprsso6.cfr_renamed_15533());
        sprsso5.cfr_renamed_17308(sprsso6.cfr_renamed_15526());
        sprsso5.cfr_renamed_17306(this.cfr_renamed_17307());
        sprsso2.cfr_renamed_17303(sprsso4.cfr_renamed_17309());
        sprsso3.cfr_renamed_17304(sprsso4.cfr_renamed_17310());
        sprsso3.cfr_renamed_17311(this.cfr_renamed_17312());
        return sprsso3;
    }

    @sprtea
    public boolean cfr_renamed_17309() {
        return (this.cfr_renamed_3 & 0xFF & 4) >> 2 != 0;
    }

    @sprtea
    public boolean cfr_renamed_17310() {
        return (this.cfr_renamed_3 & 0xFF & 0x10) >> 4 != 0;
    }

    @sprtea
    public void cfr_renamed_17311(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = (2 ^ 5) << 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ (3 ^ 5);
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

    @sprtea
    public boolean cfr_renamed_15526() {
        return (this.cfr_renamed_3 & 0xFF & 2) >> 1 != 0;
    }

    @sprtea
    public int cfr_renamed_17312() {
        return this.cfr_renamed_4;
    }
}

