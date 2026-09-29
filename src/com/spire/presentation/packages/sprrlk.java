/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprpok;
import com.spire.presentation.packages.sprzlg;
import java.security.Provider;
import java.security.SecureRandom;

public class sprrlk {
    private final String cfr_renamed_0;
    private final char[] cfr_renamed_1;
    private sprzlg cfr_renamed_2;
    private final String cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprrlk(String arg0, char[] arg1) {
        this(null, arg0, arg1);
    }

    public sprrlk cfr_renamed_1498(Provider arg0) {
        sprrlk sprrlk2 = this;
        sprrlk2.cfr_renamed_2.cfr_renamed_1498(arg0);
        return sprrlk2;
    }

    public sprrlk cfr_renamed_9728(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprpok cfr_renamed_1451() throws sprhjg {
        sprrlk sprrlk2 = this;
        sprrlk sprrlk3 = this;
        return new sprpok(sprrlk2.cfr_renamed_0, sprrlk2.cfr_renamed_3, sprrlk3.cfr_renamed_1, sprrlk3.cfr_renamed_4, this.cfr_renamed_2.cfr_renamed_1451());
    }

    /*
     * WARNING - void declaration
     */
    public sprrlk(String string, String string2, char[] cArray) {
        void arg1;
        void arg0;
        sprrlk sprrlk2 = this;
        sprrlk sprrlk3 = this;
        sprrlk sprrlk4 = this;
        sprrlk3.cfr_renamed_2 = new sprzlg();
        sprrlk3.cfr_renamed_4 = new SecureRandom();
        sprrlk3.cfr_renamed_0 = arg0;
        sprrlk2.cfr_renamed_3 = arg1;
        sprrlk2.cfr_renamed_1 = cArray;
    }

    public sprrlk cfr_renamed_1499(String arg0) {
        sprrlk sprrlk2 = this;
        sprrlk2.cfr_renamed_2.cfr_renamed_1499(arg0);
        return sprrlk2;
    }
}

