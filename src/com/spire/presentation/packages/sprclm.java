/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprfqm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrqr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwjaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprclm
extends sprqqe {
    private int cfr_renamed_79;
    private spravm cfr_renamed_107;
    private static final int cfr_renamed_132 = 3;
    private sprhmm cfr_renamed_102;
    private sprnom cfr_renamed_93;
    private sprdcm cfr_renamed_86;
    private sprktm cfr_renamed_152;
    private sprdim cfr_renamed_112;
    private sprszm cfr_renamed_119;
    private static final int cfr_renamed_91 = 2;
    private static final int cfr_renamed_0 = 1;
    private spridn cfr_renamed_1;
    private sprhgm cfr_renamed_2;
    private static final int cfr_renamed_3 = 0;
    private static final int cfr_renamed_4 = 1;

    public sprnom cfr_renamed_4777() {
        return this.cfr_renamed_93;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_79;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprwjaa.cfr_renamed_9("C5D0D\u0006u\u0017N\ra\f'\u0018\r"));
        if (this.cfr_renamed_79 != 1) {
            stringBuffer.append(sprrqr.cfr_renamed_9("M\u0004I\u0012R\u000eU[\u001b") + this.cfr_renamed_79 + "\n");
        }
        stringBuffer.append(new StringBuilder().insert(0, sprwjaa.cfr_renamed_9("c\u0015U\u0006v*i\u0005hY'")).append(this.cfr_renamed_107).append("\n").toString());
        stringBuffer.append(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("\f^\u0012H\u0000\\\u0004r\fK\u0013R\u000fO[\u001b")).append(this.cfr_renamed_112).append("\n").toString());
        stringBuffer.append(new StringBuilder().insert(0, sprwjaa.cfr_renamed_9("\u0010b\u0011n\u0002k-r\u000ee\u0006uY'")).append(this.cfr_renamed_152).append("\n").toString());
        stringBuffer.append(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("\u0013^\u0012K\u000eU\u0012^5R\f^[\u001b")).append(this.cfr_renamed_93).append("\n").toString());
        if (this.cfr_renamed_102 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprwjaa.cfr_renamed_9("\u0007q0s\u0002s\u0016tY'")).append(this.cfr_renamed_102).append("\n").toString());
        }
        if (this.cfr_renamed_86 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("\u0011T\rR\u0002B[\u001b")).append(this.cfr_renamed_86).append("\n").toString());
        }
        if (this.cfr_renamed_1 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprwjaa.cfr_renamed_9("\u0011b\u0012T\n`\rf\u0017r\u0011bY'")).append(this.cfr_renamed_1).append("\n").toString());
        }
        if (this.cfr_renamed_119 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("X\u0004I\u0015H[\u001b")).append(this.cfr_renamed_119).append("\n").toString());
        }
        if (this.cfr_renamed_2 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprwjaa.cfr_renamed_9("\u0006\u007f\u0017b\rt\nh\rtY'")).append(this.cfr_renamed_2).append("\n").toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(sprrqr.cfr_renamed_9("\u001c1"));
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprclm(spravm spravm2, sprdim sprdim2, sprktm sprktm2, sprnom sprnom2) {
        void arg2;
        void arg1;
        void arg0;
        sprclm sprclm2 = this;
        sprclm sprclm3 = this;
        this.cfr_renamed_79 = 1;
        sprclm3.cfr_renamed_107 = arg0;
        sprclm3.cfr_renamed_112 = arg1;
        sprclm2.cfr_renamed_152 = arg2;
        sprclm2.cfr_renamed_93 = sprnom2;
    }

    private /* synthetic */ void cfr_renamed_4767(int arg0) {
        this.cfr_renamed_79 = arg0;
    }

    private /* synthetic */ void cfr_renamed_11259(sprdim arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public sprfqm[] cfr_renamed_626() {
        if (this.cfr_renamed_119 != null) {
            return sprfqm.cfr_renamed_11254(this.cfr_renamed_119);
        }
        return null;
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_152;
    }

    private /* synthetic */ void cfr_renamed_11260(spravm arg0) {
        this.cfr_renamed_107 = arg0;
    }

    public static sprclm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprclm) {
            return (sprclm)arg0;
        }
        if (arg0 != null) {
            return new sprclm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprclm(sprszm sprszm2) {
        sprclm sprclm2;
        void arg0;
        sprxgf sprxgf2;
        this.cfr_renamed_79 = 1;
        int n = 0;
        sprco sprco2 = sprszm2.cfr_renamed_85(0);
        ++n;
        try {
            sprxgf2 = sprktm.cfr_renamed_23(sprco2);
            int n2 = n++;
            this.cfr_renamed_79 = sprxgf2.cfr_renamed_5023();
            sprco2 = arg0.cfr_renamed_85(n2);
            sprclm2 = this;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            sprclm2 = this;
        }
        sprclm2.cfr_renamed_107 = spravm.cfr_renamed_23(sprco2);
        void v2 = arg0;
        sprco2 = v2.cfr_renamed_85(n);
        int n3 = ++n;
        this.cfr_renamed_112 = sprdim.cfr_renamed_23(sprco2);
        sprco2 = v2.cfr_renamed_85(n3);
        int n4 = ++n;
        this.cfr_renamed_152 = sprktm.cfr_renamed_23(sprco2);
        sprco2 = v2.cfr_renamed_85(n4);
        int n5 = ++n;
        this.cfr_renamed_93 = sprnom.cfr_renamed_23(sprco2);
        block10: while (n5 < arg0.cfr_renamed_84()) {
            sprco2 = arg0.cfr_renamed_85(n);
            ++n;
            if (sprco2 instanceof sprnvm) {
                sprxgf2 = sprnvm.cfr_renamed_23(sprco2);
                int n6 = ((sprnvm)sprxgf2).cfr_renamed_312();
                switch (n6) {
                    case 0: {
                        this.cfr_renamed_102 = sprhmm.cfr_renamed_5085((sprnvm)sprxgf2, false);
                        n5 = n;
                        continue block10;
                    }
                    case 1: {
                        this.cfr_renamed_86 = sprdcm.cfr_renamed_23(sprszm.cfr_renamed_5085((sprnvm)sprxgf2, false));
                        n5 = n;
                        continue block10;
                    }
                    case 2: {
                        this.cfr_renamed_1 = spridn.cfr_renamed_5085((sprnvm)sprxgf2, false);
                        n5 = n;
                        continue block10;
                    }
                    case 3: {
                        this.cfr_renamed_119 = sprszm.cfr_renamed_5085((sprnvm)sprxgf2, false);
                        n5 = n;
                        continue block10;
                    }
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprwjaa.cfr_renamed_9("R\rl\rh\u0014iCs\u0002`Cb\rd\fr\rs\u0006u\u0006cY'")).append(n6).toString());
            }
            try {
                this.cfr_renamed_2 = sprhgm.cfr_renamed_23(sprco2);
                n5 = n;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                n5 = n;
                continue;
            }
            break;
        }
        return;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public spridn cfr_renamed_4779() {
        return this.cfr_renamed_1;
    }

    public spravm cfr_renamed_4776() {
        return this.cfr_renamed_107;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(10);
        if (this.cfr_renamed_79 != 1) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_79));
        }
        sprrvm sprrvm3 = sprrvm2;
        sprclm sprclm2 = this;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_107);
        sprrvm4.cfr_renamed_5004(this.cfr_renamed_112);
        sprrvm3.cfr_renamed_5004(sprclm2.cfr_renamed_152);
        sprrvm3.cfr_renamed_5004(sprclm2.cfr_renamed_93);
        if (this.cfr_renamed_102 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_102));
        }
        if (this.cfr_renamed_86 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_86));
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_1));
        }
        if (this.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 3, (sprco)this.cfr_renamed_119));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public sprdim cfr_renamed_592() {
        return this.cfr_renamed_112;
    }

    public sprhmm cfr_renamed_4778() {
        return this.cfr_renamed_102;
    }

    public static sprclm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprclm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprdcm cfr_renamed_598() {
        return this.cfr_renamed_86;
    }
}

