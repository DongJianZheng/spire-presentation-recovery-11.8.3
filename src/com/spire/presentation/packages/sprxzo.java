/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprdto;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprwin;
import java.util.Iterator;

@sprtea
public class sprxzo {
    private static final sprusca cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_17172(String string, String string2, sprwin sprwin2) {
        void arg1;
        String arg0;
        void arg2;
        void v0 = arg2;
        arg2.cfr_renamed_12423("Override");
        v0.cfr_renamed_12405("PartName", arg0);
        v0.cfr_renamed_12405("ContentType", (String)arg1);
        v0.cfr_renamed_12439();
    }

    static {
        String[] stringArray = new String[12];
        stringArray[0] = "application/vnd.openxmlformats-package.relationships+xml";
        stringArray[1] = "image/bmp";
        stringArray[2] = "image/x-emf";
        stringArray[3] = "image/gif";
        stringArray[4] = "image/jpeg";
        stringArray[5] = "image/x-pcz";
        stringArray[6] = "image/png";
        stringArray[7] = "image/x-wmf";
        stringArray[8] = "application/vnd.openxmlformats-officedocument.obfuscatedFont";
        stringArray[9] = "application/vnd.openxmlformats-package.digital-signature-origin";
        stringArray[10] = "application/vnd.openxmlformats-package.digital-signature-certificate";
        stringArray[11] = "image/svg+xml";
        cfr_renamed_4 = new sprusca(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_17173(String string, String string2, sprwin sprwin2) {
        void arg1;
        String arg0;
        void arg2;
        void v0 = arg2;
        arg2.cfr_renamed_12423("Default");
        v0.cfr_renamed_12405("Extension", arg0);
        v0.cfr_renamed_12405("ContentType", (String)arg1);
        v0.cfr_renamed_12439();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_13286(sprdto arg0, boolean arg1) {
        sprnyja sprnyja2;
        Iterator iterator;
        Object object2;
        spravp spravp2 = new spravp();
        spravp spravp3 = new spravp();
        block4: for (Object object2 : arg0.cfr_renamed_13274()) {
            switch (cfr_renamed_4.cfr_renamed_12854(((sprqyo)object2).cfr_renamed_696())) {
                case 0: {
                    continue block4;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: {
                    spravp2.cfr_renamed_13301(((sprqyo)object2).cfr_renamed_4780(), ((sprqyo)object2).cfr_renamed_696());
                    continue block4;
                }
            }
            spravp3.cfr_renamed_12160(((sprqyo)object2).cfr_renamed_313(), ((sprqyo)object2).cfr_renamed_696());
        }
        sprqyo sprqyo2 = new sprqyo("/[Content_Types].xml", "");
        arg0.cfr_renamed_13274().cfr_renamed_13275(sprqyo2);
        Object object3 = object2 = new sprwin(sprqyo2.cfr_renamed_13232(), arg1);
        ((sprwin)object3).cfr_renamed_12458("Types");
        ((sprwin)object3).cfr_renamed_12405("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");
        Iterator iterator2 = iterator = spravp2.iterator();
        while (iterator2.hasNext()) {
            sprnyja2 = (sprnyja)iterator.next();
            sprxzo.cfr_renamed_17173((String)sprnyja2.getKey(), (String)sprnyja2.getValue(), (sprwin)object2);
            iterator2 = iterator;
        }
        sprxzo.cfr_renamed_17173("rels", "application/vnd.openxmlformats-package.relationships+xml", (sprwin)object2);
        sprxzo.cfr_renamed_17173("xml", "application/xml", (sprwin)object2);
        iterator = spravp3.iterator();
        Iterator iterator3 = iterator;
        while (true) {
            if (!iterator3.hasNext()) {
                ((sprwin)object2).cfr_renamed_12453();
                return;
            }
            sprnyja2 = (sprnyja)iterator.next();
            sprxzo.cfr_renamed_17172((String)sprnyja2.getKey(), (String)sprnyja2.getValue(), (sprwin)object2);
            iterator3 = iterator;
        }
    }

    private /* synthetic */ sprxzo() {
    }
}

