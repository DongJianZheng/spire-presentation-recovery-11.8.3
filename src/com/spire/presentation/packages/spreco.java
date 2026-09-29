/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprgpja;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprgtn;
import com.spire.presentation.packages.sprjxq;
import com.spire.presentation.packages.sprlgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprreha;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxmo;
import com.spire.presentation.packages.sprzjo;
import java.util.Iterator;

@sprtea
public class spreco
extends sprrzn {
    @sprtea
    public spreco cfr_renamed_15749(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            spreco spreco2 = this;
            spreco2.cfr_renamed_15492("AppVersion");
            return spreco2;
        }
        spreco spreco3 = this;
        spreco3.cfr_renamed_15480("AppVersion", arg0);
        return spreco3;
    }

    @sprtea
    public String cfr_renamed_15565() {
        return this.cfr_renamed_15482("Company");
    }

    @sprtea
    public String cfr_renamed_15750() {
        return this.cfr_renamed_15482("AppVersion");
    }

    @sprtea
    public spreco() {
        super("Extension");
    }

    @sprtea
    public String cfr_renamed_15751() {
        String string = this.cfr_renamed_15482(sprjxq.cfr_renamed_9("\u0007\t67'\u0014#"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            throw new IllegalArgumentException(sprreha.cfr_renamed_9("\u7571\u4ee2\u7546\u627c\u624f\u898f\u9193\u8b89\u81b3\u5bf6\u4e10\u5b95\u8c38\u651c\u6337\u76e8\u6230\u5c39\u5ecd\u7544\u7a52\u5ee3\u5454\u799c\uff51-)\u001c\u0017\r4\t\uff50\u4e61\u80a4\u4e56\u7a23"));
        }
        return string;
    }

    @sprtea
    public spreco cfr_renamed_15752(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            throw new IllegalArgumentException(sprjxq.cfr_renamed_9("\u756e\u4ef7\u7559\u6269\u6250\u899a\u918c\u8b9c\u81ac\u5be3\u4e0f\u5b80\u8c27\u6509\u6328\u76fd\u622f\u5c2c\u5ed2\u7551\u7a4d\u5ef6\u544b\u7989\uff4e86\t\b\u0018+\u001c\uff4f\u4e74\u80bb\u4e43\u7a3c"));
        }
        spreco spreco2 = this;
        spreco2.cfr_renamed_15480(sprreha.cfr_renamed_9("\u0018\u001c)\"8\u0001<"), arg0);
        return spreco2;
    }

    @sprtea
    public spreco cfr_renamed_15753(sprzjo arg0) {
        if (arg0 == null) {
            spreco spreco2 = this;
            spreco2.cfr_renamed_15492(sprjxq.cfr_renamed_9("\u0014\u001c 0\""));
            return spreco2;
        }
        spreco spreco3 = this;
        spreco3.cfr_renamed_15480(sprreha.cfr_renamed_9("\u000b\t?%="), arg0.toString());
        return spreco3;
    }

    @sprtea
    public spreco cfr_renamed_15754(sprlgo arg0) {
        if (arg0 == null) {
            return this;
        }
        spreco spreco2 = this;
        spreco2.cfr_renamed_15421(sprjxq.cfr_renamed_9("<>\r#\u0017\"='\r'"), arg0);
        return spreco2;
    }

    @sprtea
    public sprzjo cfr_renamed_15755() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482(sprreha.cfr_renamed_9("\u000b\t?%=")));
    }

    @sprtea
    public sprdz cfr_renamed_15756() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprjxq.cfr_renamed_9(")4\u00166\u001c4\r?"));
        sprvrx<sprgtn> sprvrx2 = new sprvrx<sprgtn>(sprdz2.size());
        sprgtn sprgtn2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprgtn2 = new sprgtn(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprgtn2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprdz cfr_renamed_15757() {
        return this.cfr_renamed_15682(sprreha.cfr_renamed_9("(8\u00188"));
    }

    @sprtea
    public spreco cfr_renamed_15758(sprgtja arg0) {
        if (arg0 == null) {
            spreco spreco2 = this;
            spreco2.cfr_renamed_15492("Date");
            return spreco2;
        }
        spreco spreco3 = this;
        spreco3.cfr_renamed_15480("Date", arg0.cfr_renamed_2223(sprxmo.cfr_renamed_112));
        return spreco3;
    }

    @sprtea
    public sprdz cfr_renamed_15759() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprjxq.cfr_renamed_9("<>\r#\u0017\"='\r'"));
        sprvrx<sprlgo> sprvrx2 = new sprvrx<sprlgo>(sprdz2.size());
        sprlgo sprlgo2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprlgo2 = sprlgo.cfr_renamed_15562((sprnco)iterator.next());
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprlgo2);
        }
        return sprvrx2;
    }

    @sprtea
    public spreco cfr_renamed_15760(sprnco arg0) {
        if (arg0 == null) {
            return this;
        }
        spreco spreco2 = this;
        spreco2.cfr_renamed_15271(arg0);
        return spreco2;
    }

    @sprtea
    public spreco cfr_renamed_15566(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            spreco spreco2 = this;
            spreco2.cfr_renamed_15492("Company");
            return spreco2;
        }
        spreco spreco3 = this;
        spreco3.cfr_renamed_15480("Company", arg0);
        return spreco3;
    }

    @sprtea
    public spreco(sprnco arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public sprgtja cfr_renamed_110() {
        String string = this.cfr_renamed_15482("Date");
        if (sprriia.cfr_renamed_15321(string, null)) return sprgtja.cfr_renamed_11979();
        if (sprraia.cfr_renamed_12806(string).length() == 0) {
            return sprgtja.cfr_renamed_11979();
        }
        sprgtja sprgtja2 = sprgtja.cfr_renamed_11979();
        try {
            return sprgtja.cfr_renamed_15500(string);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            sprgpja.cfr_renamed_11735(exception2.toString());
            sprgpja.cfr_renamed_15761(exception2.getStackTrace());
            return sprgtja2;
        }
    }

    @sprtea
    public spreco cfr_renamed_15762(sprgtn arg0) {
        if (arg0 == null) {
            return this;
        }
        spreco spreco2 = this;
        spreco2.cfr_renamed_15271(arg0);
        return spreco2;
    }
}

