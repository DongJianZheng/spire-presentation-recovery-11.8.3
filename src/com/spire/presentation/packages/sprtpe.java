/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghe;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprhln;
import com.spire.presentation.packages.sprkfe;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprobe;
import com.spire.presentation.packages.sprqke;
import com.spire.presentation.packages.sprtee;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxqr;
import java.io.IOException;

public class sprtpe
extends sprkra {
    private sprgwe cfr_renamed_96;
    private static final int cfr_renamed_105 = 64;
    private static final int cfr_renamed_137 = 4;
    private sprvae cfr_renamed_79;
    private static final int cfr_renamed_107 = 2;
    private static final int cfr_renamed_132 = 16;
    private static final int cfr_renamed_102 = 1;
    private int cfr_renamed_93;
    private static final int cfr_renamed_86 = 32;
    private sprghe cfr_renamed_152;
    private sprgwe cfr_renamed_112;
    public static final int cfr_renamed_119 = 127;
    public sprgle cfr_renamed_91;
    public static final int cfr_renamed_0 = 13;
    private static final int cfr_renamed_1 = 8;
    private sprgwe cfr_renamed_2;
    private sprgwe cfr_renamed_3;
    private sprgwe cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4738(sprgwe arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_4576() == 37) {
            this.cfr_renamed_112 = arg0;
            this.cfr_renamed_93 |= 0x20;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxqr.cfr_renamed_9("\u001e\u0002$M1\u0003p$#\u0002gUa[\u0004\f7\u001e~,\u0000=\u001c$\u0013,\u0004$\u001f#\u000f(\u0016+\u0015.\u0004$\u0006(\u000f)\u00119\u0015M$\f7Mj")).append(sprqke.cfr_renamed_4706(arg0)).toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtpe(sprgwe sprgwe2, sprtee sprtee2, sprvae sprvae2, sprobe sprobe2, sprghe sprghe2, sprkfe sprkfe2, sprkfe sprkfe3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprtpe sprtpe2 = this;
        sprtpe sprtpe3 = this;
        sprtpe3.cfr_renamed_93 = 0;
        sprtpe3.cfr_renamed_4739((sprgwe)arg0);
        sprtpe sprtpe4 = this;
        sprtpe3.cfr_renamed_4740(new sprgwe(2, arg1.cfr_renamed_91()));
        sprtpe2.cfr_renamed_4741((sprvae)arg2);
        sprtpe2.cfr_renamed_4742(new sprgwe(32, arg3.cfr_renamed_91()));
        sprtpe2.cfr_renamed_4743(sprghe2);
        try {
            void arg6;
            void arg5;
            sprtpe sprtpe5 = this;
            sprtpe5.cfr_renamed_4738(new sprgwe(false, 37, new sprlqe(arg5.cfr_renamed_4572())));
            sprtpe5.cfr_renamed_4744(new sprgwe(false, 36, new sprlqe(arg6.cfr_renamed_4572())));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhln.cfr_renamed_9("|iheeb)sf'lijhmb)chslt3'")).append(iOException.getMessage()).toString());
        }
    }

    public sprkfe cfr_renamed_4719() {
        if ((this.cfr_renamed_93 & 0x20) == 32) {
            return new sprkfe(this.cfr_renamed_112.cfr_renamed_4577());
        }
        return null;
    }

    public sprkfe cfr_renamed_4711() throws IOException {
        if ((this.cfr_renamed_93 & 0x40) == 64) {
            return new sprkfe(this.cfr_renamed_4.cfr_renamed_4577());
        }
        throw new IOException(sprxqr.cfr_renamed_9("3\b\"\u00199\u000b9\u000e1\u00195M\u0015\u0015 \u0004\"\f$\u0004?\u0003p)1\u00195M>\u0002$M#\b$"));
    }

    public sprtee cfr_renamed_4725() throws IOException {
        if ((this.cfr_renamed_93 & 2) == 2) {
            return new sprtee(this.cfr_renamed_3.cfr_renamed_4577());
        }
        throw new IOException(sprhln.cfr_renamed_9("Dlu}nonjf}nfi)f|sah{n}~)ulalulijb)ifs)tls"));
    }

    private /* synthetic */ void cfr_renamed_4742(sprgwe arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_4576() == 32) {
            this.cfr_renamed_2 = arg0;
            this.cfr_renamed_93 |= 8;
            return;
        }
        throw new IllegalArgumentException(sprxqr.cfr_renamed_9("#?\u0019p\f>M\u0019\u001e?Zh\\f91\n#C\u0013,\u0002)\u0018\"\u001c)\u0015?\u000f#\u0011 \u0015M$\f7"));
    }

    @Override
    public sprvva cfr_renamed_119() {
        block4: {
            try {
                if (this.cfr_renamed_93 != 127) break block4;
                return this.cfr_renamed_4745();
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (this.cfr_renamed_93 == 13) {
            return this.cfr_renamed_4746();
        }
        return null;
    }

    private /* synthetic */ sprvva cfr_renamed_4746() throws IOException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_96);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprgwe(false, 73, this.cfr_renamed_79));
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        return new sprgwe(78, sprlre2);
    }

    private /* synthetic */ void cfr_renamed_4744(sprgwe arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_4576() == 36) {
            this.cfr_renamed_4 = arg0;
            this.cfr_renamed_93 |= 0x40;
            return;
        }
        throw new IllegalArgumentException(sprhln.cfr_renamed_9("Gh}'hi)Nzh>?81]fnt'FYWENJF]NFIVBQW@UHS@HGXMF]B)sh`"));
    }

    public int cfr_renamed_4727() {
        return this.cfr_renamed_93;
    }

    private /* synthetic */ void cfr_renamed_4743(sprghe arg0) {
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_93 |= 0x10;
    }

    private /* synthetic */ sprvva cfr_renamed_4745() throws IOException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprtpe sprtpe2 = this;
        sprlre sprlre4 = sprlre2;
        sprtpe sprtpe3 = this;
        sprlre2.cfr_renamed_49(sprtpe3.cfr_renamed_96);
        sprlre4.cfr_renamed_49(sprtpe3.cfr_renamed_3);
        sprlre sprlre5 = sprlre2;
        sprlre4.cfr_renamed_49(new sprgwe(false, 73, this.cfr_renamed_79));
        sprlre4.cfr_renamed_49(this.cfr_renamed_2);
        sprlre2.cfr_renamed_49(sprtpe2.cfr_renamed_152);
        sprlre3.cfr_renamed_49(sprtpe2.cfr_renamed_112);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        return new sprgwe(78, sprlre2);
    }

    public static sprtpe cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprtpe) {
            return (sprtpe)arg0;
        }
        if (arg0 != null) {
            return new sprtpe(sprgwe.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprgwe cfr_renamed_4747() {
        return this.cfr_renamed_96;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_4748(sprgwe arg0) throws IOException {
        sprgwe sprgwe2;
        if (arg0.cfr_renamed_4576() != 78) {
            throw new IOException(sprxqr.cfr_renamed_9("\u0012\f4M$\f7MjM>\u0002$M1\u0003p\u0004#\u0002gUa[p.\u0015?\u0004$\u0016$\u0013,\u0004(\u000f.\u001f#\u0004(\u001e9\u000f9\u0015 \u0000!\u00119\u0015"));
        }
        byte[] byArray = arg0.cfr_renamed_4577();
        sprgle sprgle2 = new sprgle(byArray);
        block9: while (true) {
            sprvva sprvva2;
            if ((sprvva2 = sprgle2.cfr_renamed_24()) == null) {
                return;
            }
            if (!(sprvva2 instanceof sprgwe)) {
                throw new IOException(new StringBuilder().insert(0, sprhln.cfr_renamed_9("Ifs)f)qhk`c)nzh>?81)dfi}bgs)=)ifs)f)CLUHwyk`dhs`hgTybjnonj'Fecbjs)=")).append(sprqke.cfr_renamed_4706(arg0)).append(sprvva2.getClass()).toString());
            }
            sprgwe2 = (sprgwe)sprvva2;
            switch (sprgwe2.cfr_renamed_4576()) {
                case 41: {
                    this.cfr_renamed_4739(sprgwe2);
                    continue block9;
                }
                case 2: {
                    this.cfr_renamed_4740(sprgwe2);
                    continue block9;
                }
                case 73: {
                    this.cfr_renamed_4741(sprvae.cfr_renamed_23(sprgwe2.cfr_renamed_4578(16)));
                    continue block9;
                }
                case 32: {
                    this.cfr_renamed_4742(sprgwe2);
                    continue block9;
                }
                case 76: {
                    this.cfr_renamed_4743(new sprghe(sprgwe2));
                    continue block9;
                }
                case 37: {
                    this.cfr_renamed_4738(sprgwe2);
                    continue block9;
                }
                case 36: {
                    this.cfr_renamed_4744(sprgwe2);
                    continue block9;
                }
            }
            break;
        }
        this.cfr_renamed_93 = 0;
        throw new IOException(new StringBuilder().insert(0, sprxqr.cfr_renamed_9("\u001e\u0002$M1M&\f<\u00044M9\u001e?Zh\\fM\u0014(\u0002, \u001d<\u00043\f$\u0004?\u0003\u0003\u001d5\u000e9\u000b9\u000ep\u00191\np")).append(sprgwe2.cfr_renamed_4576()).toString());
    }

    private /* synthetic */ sprtpe(sprgwe sprgwe2) throws IOException {
        this.cfr_renamed_93 = 0;
        this.cfr_renamed_4748(sprgwe2);
    }

    public sprghe cfr_renamed_4715() throws IOException {
        if ((this.cfr_renamed_93 & 0x10) == 16) {
            return this.cfr_renamed_152;
        }
        throw new IOException(sprhln.cfr_renamed_9("Jb{s`a`dhsl'Aheclu)F|sah{nzf}nfi)ifs)tls"));
    }

    private /* synthetic */ void cfr_renamed_4740(sprgwe arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_4576() == 2) {
            this.cfr_renamed_3 = arg0;
            this.cfr_renamed_93 |= 2;
            return;
        }
        throw new IllegalArgumentException(sprxqr.cfr_renamed_9("\u001e\u0002$M1\u0003p$#\u0002gUa[\u0004\f7\u001e~$\u0003>\u0005(\u00022\u0019)\u0015#\u0004$\u0016$\u0013,\u0004$\u001f#\u000f#\u0005 \u0012(\u0002M$\f7"));
    }

    public sprvae cfr_renamed_1157() {
        return this.cfr_renamed_79;
    }

    private /* synthetic */ void cfr_renamed_4741(sprvae arg0) {
        this.cfr_renamed_79 = sprvae.cfr_renamed_23(arg0);
        this.cfr_renamed_93 |= 4;
    }

    private /* synthetic */ void cfr_renamed_4739(sprgwe arg0) throws IllegalArgumentException {
        if (arg0.cfr_renamed_4576() == 41) {
            this.cfr_renamed_96 = arg0;
            this.cfr_renamed_93 |= 1;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprhln.cfr_renamed_9("Gh}'hi)Nzh>?81]fnt'NGSLUJOHINBVW[HONEB)sh`)=")).append(sprqke.cfr_renamed_4706(arg0)).toString());
    }

    public sprobe cfr_renamed_4723() {
        return new sprobe(this.cfr_renamed_2.cfr_renamed_4577());
    }
}

