/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtgn;
import com.spire.presentation.packages.sprtza;

@sprtea
public class sprryn
extends sprrzn {
    @sprtea
    public sprryn cfr_renamed_15479(String arg0) {
        sprryn sprryn2 = this;
        sprryn2.cfr_renamed_15480("ID", arg0);
        return sprryn2;
    }

    @sprtea
    public sprryn cfr_renamed_5866(int arg0) {
        sprryn sprryn2 = this;
        sprryn2.cfr_renamed_15480(sprtza.cfr_renamed_9("\u001f~2u."), arg0 + "");
        return sprryn2;
    }

    @sprtea
    public sprlgo cfr_renamed_15481() {
        String string = this.cfr_renamed_15482("BaseLoc");
        if (sprriia.cfr_renamed_15321(string, null)) {
            return null;
        }
        return new sprlgo(string);
    }

    @sprtea
    public sprryn cfr_renamed_15483(boolean arg0) {
        sprryn sprryn2 = this;
        sprryn2.cfr_renamed_15480(sprtgn.cfr_renamed_9("\f8=?*#;"), arg0 + "");
        return sprryn2;
    }

    @sprtea
    public boolean cfr_renamed_15484() {
        return Boolean.parseBoolean(this.cfr_renamed_15482(sprtza.cfr_renamed_9("\u0015e$b3~\"")));
    }

    @Override
    @sprtea
    public String cfr_renamed_15478() {
        return sprtgn.cfr_renamed_9(" ++w\u0019(=>&\"!");
    }

    @sprtea
    public sprryn() {
        super("Version");
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprryn(String string, int n, sprlgo sprlgo2) {
        void arg2;
        void arg1;
        sprryn sprryn2 = this;
        sprryn2();
        sprryn2.cfr_renamed_15479(string).cfr_renamed_5866((int)arg1).cfr_renamed_15235((sprlgo)arg2);
    }

    @sprtea
    public sprryn cfr_renamed_15235(sprlgo arg0) {
        sprryn sprryn2 = this;
        sprryn2.cfr_renamed_15480("BaseLoc", arg0.toString());
        return sprryn2;
    }

    @sprtea
    public sprryn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public String cfr_renamed_6005() {
        return this.cfr_renamed_15482("ID");
    }

    @sprtea
    public Integer cfr_renamed_320() {
        String string = this.cfr_renamed_15482(sprtza.cfr_renamed_9("\u001f~2u."));
        return sprriia.cfr_renamed_15321(string, null) ? -1 : sprpkja.cfr_renamed_15485(string);
    }
}

