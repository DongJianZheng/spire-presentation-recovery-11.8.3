/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartTextArea;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprhxo;
import com.spire.presentation.packages.spridja;
import com.spire.presentation.packages.sprmcja;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwmr;
import java.util.Iterator;

@sprtea
public class sprpso
extends sprhxo {
    private static final sprusca cfr_renamed_4;

    public sprpso() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprqyo cfr_renamed_17170(sprwmr arg0) {
        sprqyo sprqyo2;
        sprwmr sprwmr2 = arg0;
        String string = sprwmr2.cfr_renamed_12349("name", "");
        String string2 = sprwmr2.cfr_renamed_12349("contentType", "");
        sprwmr2.cfr_renamed_12349(sprqad.cfr_renamed_9("\u0004K\nT\u0015A\u0014W\u000eK\t"), ChartTextArea.cfr_renamed_9("\bv\u0014p\u001e"));
        sprqyo sprqyo3 = new sprqyo(string, string2);
        arg0.cfr_renamed_12372(sprqad.cfr_renamed_9("T\u0006V\u0013"));
        switch (cfr_renamed_4.cfr_renamed_12854(arg0.cfr_renamed_12286())) {
            case 0: {
                sprmcja sprmcja2 = new sprmcja(sprqyo3.cfr_renamed_13232());
                sprqyo2 = sprqyo3;
                arg0.cfr_renamed_12372(ChartTextArea.cfr_renamed_9("\u0003o\u0017F\u001av\u001a"));
                sprmcja sprmcja3 = sprmcja2;
                sprmcja3.cfr_renamed_11835(arg0.cfr_renamed_12376());
                sprmcja3.cfr_renamed_2947();
                break;
            }
            case 1: {
                String string3 = arg0.cfr_renamed_9857();
                try {
                    byte[] byArray = sprpkja.cfr_renamed_15576(string3);
                    sprqyo3.cfr_renamed_13232().cfr_renamed_4924(byArray, 0, byArray.length);
                    sprqyo2 = sprqyo3;
                }
                catch (Exception exception) {
                    sprqyo2 = sprqyo3;
                }
                break;
            }
            default: {
                sprqyo2 = sprqyo3;
            }
        }
        sprqyo2.cfr_renamed_13232().cfr_renamed_11548(0L);
        return sprqyo3;
    }

    public sprpso(spreen spreen2) {
        sprpso sprpso2 = this;
        sprpso2.cfr_renamed_17165(spreen2);
    }

    private /* synthetic */ void cfr_renamed_17165(spreen arg0) {
        sprpso sprpso2 = this;
        sprpso2.cfr_renamed_17160(arg0);
        sprpso2.cfr_renamed_17157();
    }

    static {
        String[] stringArray = new String[2];
        stringArray[0] = sprqad.cfr_renamed_9("\u001fI\u000b`\u0006P\u0006");
        stringArray[1] = ChartTextArea.cfr_renamed_9("`\u0012l\u001ap\u0002F\u001av\u001a");
        cfr_renamed_4 = new sprusca(stringArray);
    }

    private /* synthetic */ void cfr_renamed_17160(spreen arg0) {
        sprwmr sprwmr2;
        sprwmr sprwmr3 = sprwmr2 = new sprwmr(arg0);
        while (sprwmr3.cfr_renamed_12372(sprqad.cfr_renamed_9("\u0017E\u0004O\u0006C\u0002"))) {
            if (!ChartTextArea.cfr_renamed_9("r\u001ap\u000f").equals(sprwmr2.cfr_renamed_12286())) {
                sprwmr sprwmr4 = sprwmr2;
                sprwmr3 = sprwmr4;
                sprwmr4.cfr_renamed_12353();
                continue;
            }
            sprwmr sprwmr5 = sprwmr2;
            sprwmr3 = sprwmr5;
            sprqyo sprqyo2 = sprpso.cfr_renamed_17170(sprwmr5);
            this.cfr_renamed_13274().cfr_renamed_13275(sprqyo2);
        }
    }

    @Override
    public void cfr_renamed_11631(spreen arg0) {
        Iterator iterator;
        sprwin sprwin2;
        sprwin sprwin3 = sprwin2 = new sprwin(arg0, true);
        sprwin sprwin4 = sprwin2;
        sprwin4.cfr_renamed_12449(true);
        sprwin4.cfr_renamed_12426(sprqad.cfr_renamed_9("\nW\b\t\u0006T\u0017H\u000eG\u0006P\u000eK\t"), ChartTextArea.cfr_renamed_9("r\tm\u001ck\u001f?YU\u0014p\u001f,?m\u0018w\u0016g\u0015vY"));
        sprwin3.cfr_renamed_12423(sprqad.cfr_renamed_9("\u0017O\u0000\u001e\u0017E\u0004O\u0006C\u0002"));
        sprwin3.cfr_renamed_12405(ChartTextArea.cfr_renamed_9("\u0003o\u0017l\b8\u000bi\u001c"), "http://schemas.microsoft.com/office/2006/xmlPackage");
        Iterator iterator2 = iterator = this.cfr_renamed_13274().iterator();
        while (iterator2.hasNext()) {
            sprwin sprwin5;
            sprqyo sprqyo2 = (sprqyo)iterator.next();
            sprwin sprwin6 = sprwin2;
            sprqyo sprqyo3 = sprqyo2;
            sprqyo3.cfr_renamed_13232().cfr_renamed_11548(0L);
            sprwin2.cfr_renamed_12423(sprqad.cfr_renamed_9("T\fC]T\u0006V\u0013"));
            sprwin6.cfr_renamed_12405(ChartTextArea.cfr_renamed_9("r\u0010eAl\u001ao\u001e"), sprqyo2.cfr_renamed_313());
            sprwin6.cfr_renamed_12405(sprqad.cfr_renamed_9("\u0017O\u0000\u001e\u0004K\tP\u0002J\u0013p\u001eT\u0002"), sprqyo2.cfr_renamed_696());
            if (!sprqyo3.cfr_renamed_696().endsWith("xml")) {
                sprwin sprwin7 = sprwin2;
                sprwin5 = sprwin7;
                sprwin sprwin8 = sprwin2;
                sprwin2.cfr_renamed_12405(ChartTextArea.cfr_renamed_9("\u000bi\u001c8\u0018m\u0016r\tg\bq\u0012m\u0015"), sprqad.cfr_renamed_9("\u0014P\bV\u0002"));
                sprwin8.cfr_renamed_12423(ChartTextArea.cfr_renamed_9("r\u0010eA`\u0012l\u001ap\u0002F\u001av\u001a"));
                sprwin7.cfr_renamed_12451(sprqyo2.cfr_renamed_13232());
                sprwin8.cfr_renamed_12439();
            } else {
                String string = new spridja(sprqyo2.cfr_renamed_13232()).cfr_renamed_12403();
                string = new sprruha(sprqad.cfr_renamed_9("\u0018;\u001bI\u000e;\u001bY")).cfr_renamed_12004(string, "");
                sprwin sprwin9 = sprwin2;
                sprwin5 = sprwin9;
                sprwin sprwin10 = sprwin2;
                sprwin10.cfr_renamed_12423(ChartTextArea.cfr_renamed_9("\u000bi\u001c8\u0003o\u0017F\u001av\u001a"));
                sprwin9.cfr_renamed_12402(string);
                sprwin10.cfr_renamed_12439();
            }
            sprwin5.cfr_renamed_12439();
            iterator2 = iterator;
        }
        sprwin2.cfr_renamed_12453();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpso(String arg0) {
        sprgfja sprgfja2 = new sprgfja(arg0, 3, 1);
        try {
            this.cfr_renamed_17165(sprgfja2);
            if (sprgfja2 == null) return;
            sprgfja2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (sprgfja2 == null) throw throwable;
            sprgfja2.cfr_renamed_2637();
            throw throwable;
        }
    }
}

