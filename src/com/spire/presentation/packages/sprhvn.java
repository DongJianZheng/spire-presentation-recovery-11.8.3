/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbzia;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfdo;
import com.spire.presentation.packages.sprgao;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprhxr;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprmco;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpfo;
import com.spire.presentation.packages.sprqhp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwdda;
import com.spire.presentation.packages.sprzko;
import com.spire.presentation.packages.sprzyd;
import java.io.FileNotFoundException;
import java.util.Iterator;

@sprtea
public class sprhvn
extends sprtsn {
    private int cfr_renamed_3 = 0;
    public static String cfr_renamed_4 = "OFD.xml";

    public sprgao cfr_renamed_15361(int arg0) {
        String string = new StringBuilder().insert(0, "Doc_").append(arg0).toString();
        if (arg0 >= this.cfr_renamed_3) {
            this.cfr_renamed_3 = arg0 + 1;
        }
        sprgao sprgao2 = new sprgao(string, this);
        return (sprgao)this.cfr_renamed_15326(string, sprgao2);
    }

    private /* synthetic */ void cfr_renamed_15343() {
        sprvrx sprvrx2 = this.cfr_renamed_119.cfr_renamed_15309();
        if (sprvrx2 != null) {
            for (sprfdo sprfdo2 : sprvrx2) {
                int n;
                if (!sprfdo2.cfr_renamed_313().startsWith("Doc_") || this.cfr_renamed_3 > (n = Integer.parseInt(sprfdo2.cfr_renamed_313().replace("Doc_", "")))) continue;
                this.cfr_renamed_3 = n + 1;
            }
        }
    }

    public sprzko cfr_renamed_15362() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("OFD.xml");
        return new sprzko(new sprnco(sprnco2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_12167(spreen arg0, boolean arg1) throws Exception {
        Iterator iterator;
        this.cfr_renamed_119.cfr_renamed_15311(arg1);
        try {
            this.cfr_renamed_2947();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        sprqhp sprqhp2 = new sprqhp(arg0);
        Iterator iterator2 = iterator = this.cfr_renamed_119.cfr_renamed_15309().iterator();
        while (true) {
            if (!iterator2.hasNext()) {
                sprqhp2.cfr_renamed_3120();
                this.cfr_renamed_722();
                return;
            }
            sprfdo sprfdo2 = (sprfdo)iterator.next();
            iterator2 = iterator;
            sprqhp2.cfr_renamed_12178(sprfdo2.cfr_renamed_8433(), sprfdo2.cfr_renamed_13232());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgao cfr_renamed_15363() {
        if (!this.cfr_renamed_15332("OFD.xml")) return this.cfr_renamed_15361(0);
        try {
            sprpfo sprpfo2 = this.cfr_renamed_15362().cfr_renamed_15364();
            if (sprpfo2 == null) return this.cfr_renamed_15361(0);
            sprlgo sprlgo2 = sprpfo2.cfr_renamed_15365();
            sprgao sprgao2 = new sprgao(sprlgo2.cfr_renamed_15366(), this);
            return (sprgao)this.cfr_renamed_15326(sprlgo2.cfr_renamed_15366(), sprgao2);
        }
        catch (Exception exception) {
            throw new sprbzia(sprhxr.cfr_renamed_9(">&5N\t\r\u001d@\u65f6\u4e96\u8992\u67f0\u5940\u8d45"));
        }
    }

    public void cfr_renamed_15367(String arg0) throws Exception {
        if (arg0 == null) {
            throw new FileNotFoundException("");
        }
        this.cfr_renamed_11727(arg0);
    }

    public sprgao cfr_renamed_15368(int arg0) {
        String string = new StringBuilder().insert(0, "Doc_").append(arg0).toString();
        sprgao sprgao2 = new sprgao(string, this);
        return (sprgao)this.cfr_renamed_15335(string, sprgao2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprhvn cfr_renamed_15369() throws Exception {
        try {
            return new sprhvn(new sprmco());
        }
        catch (sprwdda sprwdda2) {
            throw new sprwdda(new StringBuilder().insert(0, sprzyd.cfr_renamed_9("\u65b9\u6cb2\u5242\u5e9d\u0016!\u001d\u863d\u6286\u5bde\u5631\u5d82\u4f05\u7a1d\u95ad\uff6b\u53c6\u5687\uff43")).append(sprwdda2.getMessage()).toString(), sprwdda2);
        }
    }

    @sprtea
    public sprhvn(sprmco sprmco2) {
        super("", null);
        this.cfr_renamed_119 = sprmco2;
        this.cfr_renamed_15343();
    }

    public void cfr_renamed_11631(spreen arg0) throws Exception {
        this.cfr_renamed_12167(arg0, false);
    }

    public sprgao cfr_renamed_15370(String arg0) throws Exception {
        sprgao sprgao2 = new sprgao(arg0, this);
        return (sprgao)this.cfr_renamed_15335(arg0, sprgao2);
    }

    public sprhvn cfr_renamed_15231(sprzko arg0) {
        sprhvn sprhvn2 = this;
        sprhvn2.cfr_renamed_15330("OFD.xml", arg0);
        return sprhvn2;
    }

    public sprgao cfr_renamed_15232() {
        String string = new StringBuilder().insert(0, "Doc_").append(this.cfr_renamed_3).toString();
        sprhvn sprhvn2 = this;
        ++sprhvn2.cfr_renamed_3;
        sprgao sprgao2 = new sprgao(string, this);
        return (sprgao)sprhvn2.cfr_renamed_15326(string, sprgao2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_11727(String arg0) throws Exception {
        block3: {
            sprgfja sprgfja2 = new sprgfja(arg0, 2, 3, 1);
            try {
                this.cfr_renamed_11631(sprgfja2);
                if (sprgfja2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprgfja2 != null) {
                    sprgfja2.cfr_renamed_2637();
                }
                throw throwable;
            }
            sprgfja2.cfr_renamed_2637();
            return;
        }
    }
}

