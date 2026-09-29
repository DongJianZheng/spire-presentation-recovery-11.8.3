/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.sprcqd;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhqd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjvd;
import com.spire.presentation.packages.sprkkaa;
import com.spire.presentation.packages.sprlle;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproi;
import com.spire.presentation.packages.sprrqd;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryky;
import com.spire.presentation.packages.spryxd;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsd;
import java.io.IOException;
import java.io.InputStream;

public class sprmpd {
    private sprere cfr_renamed_119;
    private sprije cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private sprere cfr_renamed_1;
    public spryxd cfr_renamed_2;
    public sprnte cfr_renamed_3;
    private sprzsd cfr_renamed_4;

    public sprmpd(byte[] arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0));
    }

    public sprije cfr_renamed_4202() {
        return this.cfr_renamed_91;
    }

    public sprmpd(byte[] arg0, spraa arg1) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0), arg1);
    }

    public sprvte cfr_renamed_4190() {
        if (this.cfr_renamed_1 == null) {
            return null;
        }
        return new sprvte(this.cfr_renamed_1);
    }

    public spryxd cfr_renamed_4171() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmpd(sprnte arg0, spraa arg1) throws sprlqd {
        this.cfr_renamed_3 = arg0;
        sprlle sprlle2 = sprlle.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_480());
        if (sprlle2.cfr_renamed_4170() != null) {
            sprmpd sprmpd2 = this;
            sprmpd2.cfr_renamed_4 = new sprzsd(sprlle2.cfr_renamed_4170());
        }
        sprlle sprlle3 = sprlle2;
        sprere sprere2 = sprlle3.cfr_renamed_4171();
        sprmpd sprmpd3 = this;
        sprlle sprlle4 = sprlle2;
        this.cfr_renamed_91 = sprlle2.cfr_renamed_4202();
        this.cfr_renamed_1 = sprlle4.cfr_renamed_4190();
        sprmpd3.cfr_renamed_0 = sprlle4.cfr_renamed_1472().cfr_renamed_186();
        sprmpd3.cfr_renamed_119 = sprlle2.cfr_renamed_4191();
        sprnte sprnte2 = sprlle3.cfr_renamed_4203();
        sprard sprard2 = new sprard(sprxue.cfr_renamed_23(sprnte2.cfr_renamed_480()).cfr_renamed_186());
        if (this.cfr_renamed_1 == null) {
            sprcqd sprcqd2 = new sprcqd(this.cfr_renamed_91, sprard2);
            this.cfr_renamed_2 = sprhqd.cfr_renamed_4157(sprere2, this.cfr_renamed_91, sprcqd2);
            return;
        }
        if (arg1 == null) {
            throw new sprlqd(spryky.cfr_renamed_9("\u001cr\u0019;\u001a7\u000e&]1\u001c>\u001e'\u00113\t=\u000fr\r \u0012$\u00146\u0018 ];\u000er\u000f7\f'\u0014 \u00186];\u001br\u001c'\t:\u0018<\t;\u001e3\t7\u0019r\u001c&\t \u00140\b&\u0018!]3\u000f7]\"\u000f7\u000e7\u0013&"));
        }
        try {
            sprrqd sprrqd2 = new sprrqd(arg1.cfr_renamed_578(sprlle2.cfr_renamed_410()), sprard2);
            this.cfr_renamed_2 = sprhqd.cfr_renamed_4158(sprere2, this.cfr_renamed_91, sprrqd2, new sprjvd(this));
            return;
        }
        catch (sprfya sprfya2) {
            throw new sprlqd(new StringBuilder().insert(0, sprkkaa.cfr_renamed_9("Y-M!@&\f7CcO1I\"X&\f'E$I0XcO\"@ Y/M7C1\u0016c")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
    }

    public sprmpd(InputStream arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0));
    }

    public sprmpd(sprnte arg0) throws sprlqd {
        this(arg0, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4204() {
        try {
            sprmpd sprmpd2 = this;
            return sprmpd2.cfr_renamed_3956(sprmpd2.cfr_renamed_91.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, spryky.cfr_renamed_9("\u0018*\u001e7\r&\u0014=\u0013r\u001a7\t&\u0014<\u001ar\u0018<\u001e \u0004\"\t;\u0012<]\"\u001c \u001c?\u0018&\u0018 \u000er")).append(exception).toString());
        }
    }

    public sprvte cfr_renamed_4191() {
        if (this.cfr_renamed_119 == null) {
            return null;
        }
        return new sprvte(this.cfr_renamed_119);
    }

    public static /* synthetic */ sprere cfr_renamed_4207(sprmpd arg0) {
        return arg0.cfr_renamed_1;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprmpd(InputStream arg0, spraa arg1) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0), arg1);
    }

    public byte[] cfr_renamed_1472() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_0);
    }

    public String cfr_renamed_4201() {
        return this.cfr_renamed_91.cfr_renamed_593().cfr_renamed_19();
    }

    public byte[] cfr_renamed_3964() {
        if (this.cfr_renamed_1 != null) {
            return sprxue.cfr_renamed_23(this.cfr_renamed_4190().cfr_renamed_625(sproi.cfr_renamed_3).cfr_renamed_206().cfr_renamed_85(0)).cfr_renamed_186();
        }
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ (2 ^ 5);
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

    public sprzsd cfr_renamed_4170() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ byte[] cfr_renamed_3956(spra arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    public sprnte cfr_renamed_2442() {
        return this.cfr_renamed_3;
    }
}

