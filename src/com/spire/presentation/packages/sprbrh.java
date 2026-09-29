/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbeea;
import com.spire.presentation.packages.sprzsr;
import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class sprbrh
implements PolicyNode {
    public int cfr_renamed_119;
    public boolean cfr_renamed_91;
    public Set cfr_renamed_0;
    public PolicyNode cfr_renamed_1;
    public List cfr_renamed_2;
    public Set cfr_renamed_3;
    public String cfr_renamed_4;

    @Override
    public boolean isCritical() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_5082(sprbrh arg0) {
        this.cfr_renamed_2.add(arg0);
        arg0.cfr_renamed_9127(this);
    }

    public String cfr_renamed_2223(String arg0) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(arg0);
        stringBuffer.append(this.cfr_renamed_4);
        stringBuffer.append(sprzsr.cfr_renamed_9(",t\u0006"));
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_2.size()) {
            sprbrh sprbrh2 = (sprbrh)this.cfr_renamed_2.get(n);
            stringBuffer.append(sprbrh2.cfr_renamed_2223(new StringBuilder().insert(0, arg0).append("    ").toString()));
            n2 = ++n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(arg0);
        stringBuffer.append(sprbeea.cfr_renamed_9("\u0004("));
        return stringBuffer2.toString();
    }

    public Set getExpectedPolicies() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_5094(Set arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @Override
    public int getDepth() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_338(boolean arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public String toString() {
        return this.cfr_renamed_2223("");
    }

    /*
     * WARNING - void declaration
     */
    public sprbrh(List list, int n, Set set, PolicyNode policyNode, Set set2, String string, boolean bl) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbrh sprbrh2 = this;
        sprbrh sprbrh3 = this;
        sprbrh sprbrh4 = this;
        this.cfr_renamed_2 = arg0;
        sprbrh4.cfr_renamed_119 = arg1;
        sprbrh4.cfr_renamed_0 = arg2;
        sprbrh3.cfr_renamed_1 = arg3;
        sprbrh3.cfr_renamed_3 = arg4;
        sprbrh2.cfr_renamed_4 = arg5;
        sprbrh2.cfr_renamed_91 = bl;
    }

    public Object clone() {
        return this.cfr_renamed_461();
    }

    public Set getPolicyQualifiers() {
        return this.cfr_renamed_3;
    }

    @Override
    public String getValidPolicy() {
        return this.cfr_renamed_4;
    }

    public Iterator getChildren() {
        return this.cfr_renamed_2.iterator();
    }

    public boolean cfr_renamed_336() {
        return !this.cfr_renamed_2.isEmpty();
    }

    public sprbrh cfr_renamed_461() {
        Iterator iterator;
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator2 = iterator = this.cfr_renamed_0.iterator();
        while (iterator2.hasNext()) {
            hashSet.add(new String((String)iterator.next()));
            iterator2 = iterator;
        }
        HashSet<String> hashSet2 = new HashSet<String>();
        iterator = this.cfr_renamed_3.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            hashSet2.add(new String((String)iterator.next()));
            iterator3 = iterator;
        }
        sprbrh sprbrh2 = new sprbrh(new ArrayList(), this.cfr_renamed_119, hashSet, null, hashSet2, new String(this.cfr_renamed_4), this.cfr_renamed_91);
        iterator = this.cfr_renamed_2.iterator();
        Iterator iterator4 = iterator;
        while (iterator4.hasNext()) {
            sprbrh sprbrh3 = ((sprbrh)iterator.next()).cfr_renamed_461();
            iterator4 = iterator;
            sprbrh sprbrh4 = sprbrh3;
            sprbrh sprbrh5 = sprbrh2;
            sprbrh4.cfr_renamed_9127(sprbrh5);
            sprbrh5.cfr_renamed_5082(sprbrh4);
        }
        return sprbrh2;
    }

    @Override
    public PolicyNode getParent() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_9127(sprbrh arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_5095(sprbrh arg0) {
        this.cfr_renamed_2.remove(arg0);
    }
}

