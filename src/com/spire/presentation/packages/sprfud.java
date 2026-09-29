/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.spraud;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcue;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfsd;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprjan;
import com.spire.presentation.packages.sprjve;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprrl;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwvd;
import com.spire.presentation.packages.sprwxa;
import com.spire.presentation.packages.sprxrd;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprxun;
import com.spire.presentation.packages.spryl;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprfud {
    public sprcue cfr_renamed_91;
    public sprwvd cfr_renamed_0;
    public sprql cfr_renamed_1;
    public sprnte cfr_renamed_2;
    private Map cfr_renamed_3;
    private static final spraud cfr_renamed_4 = spraud.cfr_renamed_3;

    /*
     * WARNING - void declaration
     */
    public sprfud(sprrl sprrl2, sprnte sprnte2) throws sprlqd {
        void arg1;
        sprfud sprfud2;
        void arg0;
        if (sprrl2 instanceof sprql) {
            this.cfr_renamed_1 = (sprql)arg0;
            sprfud2 = this;
        } else {
            sprfud2 = this;
            this.cfr_renamed_1 = new sprxrd(this, (sprrl)arg0);
        }
        sprfud2.cfr_renamed_2 = arg1;
        this.cfr_renamed_91 = this.cfr_renamed_4151();
    }

    public sprfud(Map arg0, byte[] arg1) throws sprlqd {
        this(arg0, sprerd.cfr_renamed_4106(arg1));
    }

    public String cfr_renamed_620() {
        return this.cfr_renamed_91.cfr_renamed_2589().cfr_renamed_696().cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprcue cfr_renamed_4151() throws sprlqd {
        try {
            return sprcue.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_480());
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprxun.cfr_renamed_9("m>L9O-M:D\u007fC0N+E1Tq"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(sprjan.cfr_renamed_9("O\u001an\u001dm\to\u001ef[a\u0014l\u000fg\u0015vU"), illegalArgumentException);
        }
    }

    public sprfud(InputStream arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0));
    }

    public static sprfud cfr_renamed_4152(sprfud arg0, spro arg1, spro arg2, spro arg3) throws sprlqd {
        Object object;
        sprfud sprfud2 = new sprfud(arg0);
        sprere sprere2 = null;
        Object object2 = null;
        if (arg1 != null || arg2 != null) {
            sprere sprere3;
            object = new ArrayList();
            if (arg1 != null) {
                object.addAll(sprerd.cfr_renamed_4014(arg1));
            }
            if (arg2 != null) {
                object.addAll(sprerd.cfr_renamed_4107(arg2));
            }
            if ((sprere3 = sprerd.cfr_renamed_4116((List)object)).cfr_renamed_84() != 0) {
                sprere2 = sprere3;
            }
        }
        if (arg3 != null && ((sprere)(object = sprerd.cfr_renamed_4116(sprerd.cfr_renamed_4015(arg3)))).cfr_renamed_84() != 0) {
            object2 = object;
        }
        sprfud2.cfr_renamed_91 = new sprcue(arg0.cfr_renamed_91.cfr_renamed_4139(), arg0.cfr_renamed_91.cfr_renamed_2589(), sprere2, (sprere)object2, arg0.cfr_renamed_91.cfr_renamed_621());
        sprfud sprfud3 = sprfud2;
        sprfud2.cfr_renamed_2 = new sprnte(sprfud2.cfr_renamed_2.cfr_renamed_696(), sprfud2.cfr_renamed_91);
        return sprfud2;
    }

    public sprnte cfr_renamed_568() {
        return this.cfr_renamed_2;
    }

    public spro cfr_renamed_4146(sprtzd arg0) {
        return cfr_renamed_4.cfr_renamed_4118(arg0, this.cfr_renamed_91.cfr_renamed_633());
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_91();
    }

    public sprfud(Map arg0, sprnte arg1) throws sprlqd {
        sprfud sprfud2 = this;
        this.cfr_renamed_3 = arg0;
        sprfud2.cfr_renamed_2 = arg1;
        sprfud2.cfr_renamed_91 = this.cfr_renamed_4151();
    }

    public sprfud(sprrl arg0, InputStream arg1) throws sprlqd {
        this(arg0, sprerd.cfr_renamed_4104(new sprgle(arg1)));
    }

    public sprfud(sprrl arg0, byte[] arg1) throws sprlqd {
        this(arg0, sprerd.cfr_renamed_4106(arg1));
    }

    public sprfud(byte[] arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0));
    }

    public boolean cfr_renamed_4153(spryl arg0, boolean arg1) throws sprlqd {
        for (sprpod sprpod2 : this.cfr_renamed_621().cfr_renamed_622()) {
            block6: {
                sprfsd sprfsd2 = arg0.cfr_renamed_3951(sprpod2.cfr_renamed_634());
                if (sprpod2.cfr_renamed_632(sprfsd2)) break block6;
                return false;
            }
            try {
                if (arg1) continue;
                for (sprpod sprpod3 : sprpod2.cfr_renamed_3975().cfr_renamed_622()) {
                    sprfsd sprfsd3;
                    if (sprpod3.cfr_renamed_632(sprfsd3 = arg0.cfr_renamed_3951(sprpod2.cfr_renamed_634()))) continue;
                    return false;
                }
            }
            catch (sprfya sprfya2) {
                throw new sprlqd(new StringBuilder().insert(0, sprxun.cfr_renamed_9("F>I3U-E\u007fI1\u0000)E-I9I:R\u007fP-O)I;E-\u001a\u007f")).append(sprfya2.getMessage()).toString(), sprfya2);
            }
        }
        return true;
    }

    public sprql cfr_renamed_623() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfud(sprfud sprfud2) {
        void arg0;
        sprfud sprfud3 = this;
        void v1 = arg0;
        this.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_2 = v1.cfr_renamed_2;
        sprfud3.cfr_renamed_1 = v1.cfr_renamed_1;
        sprfud3.cfr_renamed_0 = sprfud2.cfr_renamed_0;
    }

    public boolean cfr_renamed_4154(spryl arg0) throws sprlqd {
        return this.cfr_renamed_4153(arg0, false);
    }

    public static sprfud cfr_renamed_4155(sprfud arg0, sprwvd arg1) {
        int n;
        Object object;
        Iterator iterator;
        sprfud sprfud2 = new sprfud(arg0);
        new sprfud(arg0).cfr_renamed_0 = arg1;
        sprlre sprlre2 = new sprlre();
        sprlre sprlre3 = new sprlre();
        Iterator iterator2 = iterator = arg1.cfr_renamed_622().iterator();
        while (iterator2.hasNext()) {
            object = (sprpod)iterator.next();
            iterator2 = iterator;
            Object object2 = object;
            sprlre2.cfr_renamed_49(spraud.cfr_renamed_3.cfr_renamed_4122(((sprpod)object2).cfr_renamed_3960()));
            sprlre3.cfr_renamed_49(((sprpod)object2).cfr_renamed_568());
        }
        object = new sprcwe(sprlre2);
        sprcwe sprcwe2 = new sprcwe(sprlre3);
        sprbne sprbne2 = (sprbne)arg0.cfr_renamed_91.cfr_renamed_119();
        sprlre sprlre4 = sprlre3 = new sprlre();
        sprlre4.cfr_renamed_49(sprbne2.cfr_renamed_85(0));
        sprlre4.cfr_renamed_49((spra)object);
        int n2 = n = 2;
        while (n2 != sprbne2.cfr_renamed_84() - 1) {
            sprlre3.cfr_renamed_49(sprbne2.cfr_renamed_85(n++));
            n2 = n;
        }
        sprlre3.cfr_renamed_49(sprcwe2);
        sprfud sprfud3 = sprfud2;
        sprfud2.cfr_renamed_91 = sprcue.cfr_renamed_23(new sprjve(sprlre3));
        sprfud3.cfr_renamed_2 = new sprnte(sprfud2.cfr_renamed_2.cfr_renamed_696(), sprfud2.cfr_renamed_91);
        return sprfud2;
    }

    public spro cfr_renamed_633() {
        return cfr_renamed_4.cfr_renamed_4121(this.cfr_renamed_91.cfr_renamed_633());
    }

    public spro cfr_renamed_618() {
        return cfr_renamed_4.cfr_renamed_4120(this.cfr_renamed_91.cfr_renamed_617());
    }

    public spro cfr_renamed_617() {
        return cfr_renamed_4.cfr_renamed_4119(this.cfr_renamed_91.cfr_renamed_617());
    }

    public sprwvd cfr_renamed_621() {
        if (this.cfr_renamed_0 == null) {
            int n;
            sprere sprere2 = this.cfr_renamed_91.cfr_renamed_621();
            ArrayList<sprpod> arrayList = new ArrayList<sprpod>();
            sprwxa sprwxa2 = new sprwxa();
            int n2 = n = 0;
            while (n2 != sprere2.cfr_renamed_84()) {
                sprfve sprfve2 = sprfve.cfr_renamed_23(sprere2.cfr_renamed_85(n));
                sprfud sprfud2 = this;
                sprtzd sprtzd2 = sprfud2.cfr_renamed_91.cfr_renamed_2589().cfr_renamed_696();
                if (sprfud2.cfr_renamed_3 == null) {
                    arrayList.add(new sprpod(sprfve2, sprtzd2, this.cfr_renamed_1, null));
                } else {
                    byte[] byArray = this.cfr_renamed_3.keySet().iterator().next() instanceof String ? (byte[])this.cfr_renamed_3.get(sprfve2.cfr_renamed_410().cfr_renamed_593().cfr_renamed_19()) : (byte[])this.cfr_renamed_3.get(sprfve2.cfr_renamed_410().cfr_renamed_593());
                    arrayList.add(new sprpod(sprfve2, sprtzd2, null, byArray));
                }
                n2 = ++n;
            }
            this.cfr_renamed_0 = new sprwvd(arrayList);
        }
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_91.cfr_renamed_3().cfr_renamed_97().intValue();
    }

    public sprfud(sprnte arg0) throws sprlqd {
        sprfud sprfud2 = this;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_91 = sprfud2.cfr_renamed_4151();
        if (this.cfr_renamed_91.cfr_renamed_2589().cfr_renamed_480() != null) {
            sprfud sprfud3 = this;
            this.cfr_renamed_1 = new sprard(this.cfr_renamed_91.cfr_renamed_2589().cfr_renamed_696(), ((sprxue)this.cfr_renamed_91.cfr_renamed_2589().cfr_renamed_480()).cfr_renamed_186());
            return;
        }
        this.cfr_renamed_1 = null;
    }
}

