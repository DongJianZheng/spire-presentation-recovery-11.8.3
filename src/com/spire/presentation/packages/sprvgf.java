/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfff;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprohf;
import com.spire.presentation.packages.sprqgf;
import com.spire.presentation.packages.sprrgm;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprycf;
import com.spire.presentation.packages.spryze;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sprvgf
implements sprug<sprycf> {
    private Map<spryze, List<sprycf>> cfr_renamed_3;
    private sprjj cfr_renamed_4;

    @Override
    public Collection<sprycf> cfr_renamed_3216(sprhd<sprycf> arg0) throws sprine {
        if (arg0 instanceof sprfff) {
            spryze spryze2 = new spryze(((sprfff)arg0).cfr_renamed_2609().cfr_renamed_3221(this.cfr_renamed_4, null));
            List<sprycf> list = this.cfr_renamed_3.get(spryze2);
            if (list != null) {
                int n;
                ArrayList<sprycf> arrayList = new ArrayList<sprycf>(list.size());
                int n2 = n = 0;
                while (n2 != list.size()) {
                    sprycf sprycf2 = list.get(n);
                    if (arg0.cfr_renamed_132(sprycf2)) {
                        arrayList.add(sprycf2);
                    }
                    n2 = ++n;
                }
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        }
        if (arg0 == null) {
            Iterator<List<sprycf>> iterator;
            HashSet<sprycf> hashSet = new HashSet<sprycf>(this.cfr_renamed_3.size());
            Iterator<List<sprycf>> iterator2 = iterator = this.cfr_renamed_3.values().iterator();
            while (iterator2.hasNext()) {
                hashSet.addAll(iterator.next());
                iterator2 = iterator;
            }
            return Collections.unmodifiableList(new ArrayList(hashSet));
        }
        HashSet<sprycf> hashSet = new HashSet<sprycf>();
        for (List<sprycf> list : this.cfr_renamed_3.values()) {
            int n;
            int n3 = n = 0;
            while (n3 != list.size()) {
                if (arg0.cfr_renamed_132(list.get(n))) {
                    hashSet.add(list.get(n));
                }
                n3 = ++n;
            }
        }
        return Collections.unmodifiableList(new ArrayList(hashSet));
    }

    public sprvgf(Collection<sprycf> collection) throws sprhjg {
        sprvgf sprvgf2 = this;
        this.cfr_renamed_3 = new HashMap<spryze, List<sprycf>>();
        this.cfr_renamed_4 = null;
        for (sprycf sprycf2 : collection) {
            Object object;
            sprrgm sprrgm2 = sprycf2.cfr_renamed_5329()[0];
            if (this.cfr_renamed_4 == null) {
                object = sprycf2.cfr_renamed_5330();
                this.cfr_renamed_4 = object.cfr_renamed_5279(sprrgm2.cfr_renamed_1479());
            }
            if ((object = sprrgm2.cfr_renamed_5331()) != null) {
                byte[][] byArray = ((sprqgf)object).cfr_renamed_205();
                if (byArray.length > 1) {
                    int n;
                    int n2 = n = 0;
                    while (n2 != byArray.length) {
                        byte[] byArray2 = byArray[n];
                        this.cfr_renamed_5332(new spryze(byArray2), sprycf2);
                        n2 = ++n;
                    }
                    this.cfr_renamed_5332(new spryze(sprohf.cfr_renamed_5317(this.cfr_renamed_4, (sprqgf)object)), sprycf2);
                    continue;
                }
                this.cfr_renamed_5332(new spryze(byArray[0]), sprycf2);
                continue;
            }
            this.cfr_renamed_5332(new spryze(sprrgm2.cfr_renamed_5333()), sprycf2);
        }
    }

    private /* synthetic */ void cfr_renamed_5332(spryze arg0, sprycf arg1) {
        List<sprycf> list = this.cfr_renamed_3.get(arg0);
        if (list != null) {
            ArrayList<sprycf> arrayList = new ArrayList<sprycf>(list.size() + 1);
            arrayList.addAll(list);
            arrayList.add(arg1);
            this.cfr_renamed_3.put(arg0, arrayList);
            return;
        }
        this.cfr_renamed_3.put(arg0, Collections.singletonList(arg1));
    }
}

