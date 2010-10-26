package org.jboss.seam.drools.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jboss.weld.extensions.bean.generic.GenericConfiguration;

@GenericConfiguration(Drools.class)
public class RuleResources
{
   private List<RuleResource> ruleResources = new ArrayList<RuleResource>();
   
   public Iterator<RuleResource> iterator() {
      return ruleResources.iterator();
   }
   
   public RuleResources add(RuleResource ruleResource) {
      ruleResources.add(ruleResource);
      return this;
   }
   
   public RuleResources addAll(RuleResource... ruleResources) {
      for(RuleResource rl : ruleResources) {
         this.ruleResources.add(rl);
      }
      return this;
   }
   
   public int size() {
      return ruleResources.size();
   }
}
