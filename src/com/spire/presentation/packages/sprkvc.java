/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprfzc;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.spriua;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprrcaa;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprwyc;
import com.spire.presentation.packages.sprzsc;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprkvc
implements sprgg {
    public static final int cfr_renamed_0 = 4;
    public sprsc cfr_renamed_1;
    private Hashtable cfr_renamed_2;
    private Short cfr_renamed_3;
    private sprwyc cfr_renamed_4;

    @Override
    public sprgg cfr_renamed_2958() {
        sprkvc sprkvc2 = this;
        sprlc sprlc2 = sprzsc.cfr_renamed_2673(this.cfr_renamed_3, (sprlc)sprkvc2.cfr_renamed_2.get(sprkvc2.cfr_renamed_3));
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.cfr_renamed_2997(sprlc2);
        }
        sprkvc sprkvc3 = new sprkvc(this.cfr_renamed_3, sprlc2);
        sprkvc3.cfr_renamed_2797(this.cfr_renamed_1);
        return sprkvc3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkvc(Short s, sprlc sprlc2) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = null;
        sprkvc sprkvc2 = this;
        this.cfr_renamed_2 = new Hashtable();
        this.cfr_renamed_3 = s;
        this.cfr_renamed_2.put(arg0, arg1);
    }

    public void cfr_renamed_3176() {
        if (this.cfr_renamed_4 != null && this.cfr_renamed_2.size() <= 4) {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = this.cfr_renamed_2.elements();
            while (enumeration2.hasMoreElements()) {
                sprlc sprlc2 = (sprlc)enumeration.nextElement();
                enumeration2 = enumeration;
                this.cfr_renamed_4.cfr_renamed_2997(sprlc2);
            }
            this.cfr_renamed_4 = null;
        }
    }

    @Override
    public sprlc cfr_renamed_2942() {
        sprkvc sprkvc2 = this;
        sprkvc2.cfr_renamed_3176();
        if (sprkvc2.cfr_renamed_4 != null) {
            sprkvc sprkvc3 = this;
            sprlc sprlc2 = sprzsc.cfr_renamed_2640(sprkvc3.cfr_renamed_3);
            sprkvc3.cfr_renamed_4.cfr_renamed_2997(sprlc2);
            return sprlc2;
        }
        sprkvc sprkvc4 = this;
        return sprzsc.cfr_renamed_2673(this.cfr_renamed_3, (sprlc)sprkvc4.cfr_renamed_2.get(sprkvc4.cfr_renamed_3));
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        Enumeration enumeration;
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.write(arg0);
            return;
        }
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.elements();
        while (enumeration2.hasMoreElements()) {
            ((sprlc)enumeration.nextElement()).cfr_renamed_1221(arg0);
            enumeration2 = enumeration;
        }
    }

    @Override
    public void cfr_renamed_2691(short arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprrcaa.cfr_renamed_9("r\u0005IJJ\u000bR\u000f\u0006\u001eIJR\u0018G\tMJK\u0005T\u000f\u0006\u0002G\u0019NJG\u0006A\u0005T\u0003R\u0002K\u0019"));
        }
        this.cfr_renamed_3177(spriua.cfr_renamed_435(arg0));
    }

    @Override
    public void cfr_renamed_2883() {
        this.cfr_renamed_3176();
    }

    @Override
    public void cfr_renamed_2797(sprsc arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @Override
    public int cfr_renamed_1218() {
        throw new IllegalStateException(sprcye.cfr_renamed_9("\t\u00069U:\u001a.\u001et\\|\u00013U;\u0010(U=U8\u0010:\u001c2\u001c(\u0010|15\u00129\u0006("));
    }

    @Override
    public byte[] cfr_renamed_2821(short arg0) {
        sprlc sprlc2 = (sprlc)this.cfr_renamed_2.get(spriua.cfr_renamed_435(arg0));
        if (sprlc2 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprrcaa.cfr_renamed_9("n\u000bU\u0002g\u0006A\u0005T\u0003R\u0002KJ")).append(arg0).append(sprcye.cfr_renamed_9("|\u001c/U2\u001a(U>\u00105\u001b;U(\u0007=\u00167\u00108")).toString());
        }
        sprlc2 = sprzsc.cfr_renamed_2673(arg0, sprlc2);
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.cfr_renamed_2997(sprlc2);
        }
        sprlc sprlc3 = sprlc2;
        byte[] byArray = new byte[sprlc3.cfr_renamed_1218()];
        sprlc3.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public sprgg cfr_renamed_2957() {
        int n = this.cfr_renamed_1.cfr_renamed_2666().cfr_renamed_2686();
        if (n == 0) {
            sprfzc sprfzc2 = new sprfzc();
            sprkvc sprkvc2 = this;
            sprfzc2.cfr_renamed_2797(sprkvc2.cfr_renamed_1);
            sprfzc sprfzc3 = sprfzc2;
            sprkvc2.cfr_renamed_4.cfr_renamed_2997(sprfzc3);
            return sprfzc3.cfr_renamed_2957();
        }
        sprkvc sprkvc3 = this;
        sprkvc3.cfr_renamed_3 = spriua.cfr_renamed_435(sprzsc.cfr_renamed_2650(n));
        sprkvc3.cfr_renamed_3177(sprkvc3.cfr_renamed_3);
        return sprkvc3;
    }

    public sprkvc() {
        sprkvc sprkvc2 = this;
        sprkvc sprkvc3 = this;
        sprkvc2.cfr_renamed_4 = new sprwyc();
        sprkvc2.cfr_renamed_2 = new Hashtable();
        sprkvc2.cfr_renamed_3 = null;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        throw new IllegalStateException(sprrcaa.cfr_renamed_9("?U\u000f\u0006\fI\u0018MB\u000fJR\u0005\u0006\rC\u001e\u0006\u000b\u0006\u000eC\fO\u0004O\u001eCJb\u0003A\u000fU\u001e"));
    }

    @Override
    public void cfr_renamed_41() {
        Enumeration enumeration;
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.reset();
            return;
        }
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.elements();
        while (enumeration2.hasMoreElements()) {
            ((sprlc)enumeration.nextElement()).cfr_renamed_41();
            enumeration2 = enumeration;
        }
    }

    public void cfr_renamed_3177(Short arg0) {
        if (!this.cfr_renamed_2.containsKey(arg0)) {
            sprlc sprlc2 = sprzsc.cfr_renamed_2640(arg0);
            this.cfr_renamed_2.put(arg0, sprlc2);
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        Enumeration enumeration;
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.write(arg0, arg1, arg2);
            return;
        }
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.elements();
        while (enumeration2.hasMoreElements()) {
            ((sprlc)enumeration.nextElement()).cfr_renamed_1197(arg0, arg1, arg2);
            enumeration2 = enumeration;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        throw new IllegalStateException(sprcye.cfr_renamed_9("\t\u00069U:\u001a.\u001et\\|\u00013U;\u0010(U=U8\u0010:\u001c2\u001c(\u0010|15\u00129\u0006("));
    }
}

