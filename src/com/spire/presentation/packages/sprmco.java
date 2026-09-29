/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfdo;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprigja;
import com.spire.presentation.packages.sprkgr;
import com.spire.presentation.packages.sprlzia;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprsyia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprywq;
import com.spire.presentation.packages.sprzdja;
import com.spire.presentation.packages.sprznj;
import java.util.Iterator;

@sprtea
public class sprmco {
    private boolean cfr_renamed_2;
    private sprvrx cfr_renamed_3;
    private static String cfr_renamed_4 = new StringBuilder().insert(0, System.getenv(sprznj.cfr_renamed_9("YU]"))).append("\\").append(sprlzia.cfr_renamed_15222().toString()).append("\\").toString();

    public sprmco() {
        sprmco sprmco2 = this;
        sprmco2.cfr_renamed_3 = new sprvrx();
    }

    public void cfr_renamed_15307(byte[] arg0, String arg1) {
        if (arg0 == null) {
            return;
        }
        if (this.cfr_renamed_2) {
            sprzdja sprzdja2 = new sprzdja(new StringBuilder().insert(0, cfr_renamed_4).append(arg1).toString());
            sprigja sprigja2 = sprzdja2.cfr_renamed_15308();
            if (!sprigja2.cfr_renamed_15301()) {
                sprigja2.cfr_renamed_1631();
            }
            sprgfja sprgfja2 = new sprgfja(new StringBuilder().insert(0, cfr_renamed_4).append(arg1).toString(), 2, 3, 1);
            sprgfja2.cfr_renamed_4924(arg0, 0, arg0.length);
            sprfdo sprfdo2 = new sprfdo(sprgfja2, arg1);
            this.cfr_renamed_3.add(sprfdo2);
            return;
        }
        sprpdja sprpdja2 = new sprpdja(arg0);
        sprfdo sprfdo3 = new sprfdo(sprpdja2, arg1);
        this.cfr_renamed_3.add(sprfdo3);
    }

    public void cfr_renamed_722() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_15309().iterator();
        while (iterator2.hasNext()) {
            sprfdo sprfdo2 = (sprfdo)iterator.next();
            iterator2 = iterator;
            sprfdo sprfdo3 = sprfdo2;
            sprfdo3.cfr_renamed_13232().cfr_renamed_2637();
            sprfdo3.cfr_renamed_13232().dispose();
        }
        sprmco sprmco2 = this;
        sprmco2.cfr_renamed_15309().clear();
        if (sprmco2.cfr_renamed_2) {
            sprsyia.cfr_renamed_15310(cfr_renamed_4, true);
        }
    }

    public void cfr_renamed_15311(boolean arg0) {
        if (arg0) {
            sprsyia.cfr_renamed_11888(cfr_renamed_4);
        }
        this.cfr_renamed_2 = arg0;
    }

    public byte[] cfr_renamed_15312(sprnco arg0) {
        return sprszca.cfr_renamed_12801().cfr_renamed_11606(arg0.cfr_renamed_15313().cfr_renamed_15314());
    }

    public void cfr_renamed_15315(sprnco arg0, String arg1) {
        Object object;
        sprywq sprywq2;
        if (arg0 == null) {
            return;
        }
        sprywq sprywq3 = arg0.cfr_renamed_15313().cfr_renamed_12322();
        if (sprywq3 == null) {
            arg0 = (sprnco)arg0.cfr_renamed_12099();
            sprywq2 = sprywq3 = new sprywq();
        } else {
            sprywq sprywq4 = sprywq3;
            if (sprywq3.cfr_renamed_12883() != null) {
                sprywq4.cfr_renamed_15316(sprywq3.cfr_renamed_12883());
                sprywq2 = sprywq3;
            } else {
                object = sprywq4.cfr_renamed_15317("1.0", "UTF-8", null);
                sprywq sprywq5 = sprywq3;
                sprywq2 = sprywq5;
                sprywq5.cfr_renamed_15318((sprkgr)object);
            }
        }
        sprywq2.cfr_renamed_15318(arg0.cfr_renamed_15313());
        if (this.cfr_renamed_2) {
            object = new sprzdja(new StringBuilder().insert(0, cfr_renamed_4).append(arg1).toString());
            sprigja sprigja2 = ((sprzdja)object).cfr_renamed_15308();
            if (!sprigja2.cfr_renamed_15301()) {
                sprigja2.cfr_renamed_1631();
            }
            sprgfja sprgfja2 = new sprgfja(new StringBuilder().insert(0, cfr_renamed_4).append(arg1).toString(), 2, 3, 1);
            sprywq3.cfr_renamed_11631(sprgfja2);
            sprfdo sprfdo2 = new sprfdo(sprgfja2, arg1);
            this.cfr_renamed_3.add(sprfdo2);
            return;
        }
        object = new sprpdja();
        sprywq3.cfr_renamed_11631((spreen)object);
        sprfdo sprfdo3 = new sprfdo((spreen)object, arg1);
        this.cfr_renamed_3.add(sprfdo3);
    }

    public sprvrx cfr_renamed_15309() {
        return this.cfr_renamed_3;
    }

    public sprnco cfr_renamed_15319(spreen arg0) {
        sprywq sprywq2 = new sprywq();
        sprywq2.cfr_renamed_12331(arg0);
        return new sprnco(sprywq2.cfr_renamed_12883());
    }
}

