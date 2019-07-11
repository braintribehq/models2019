/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcResourceTime of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link ScheduleWork}, 
{@link ScheduleUsage}, 
{@link ScheduleUsageAsString}, 
{@link ScheduleStart}, 
{@link ScheduleFinish}, 
{@link ScheduleContour}, 
{@link LevelingDelay}, 
{@link IsOverAllocated}, 
{@link StatusTime}, 
{@link ActualWork}, 
{@link ActualUsage}, 
{@link ActualUsageAsString}, 
{@link ActualStart}, 
{@link ActualFinish}, 
{@link RemainingWork}, 
{@link RemainingUsage}, 
{@link RemainingUsageAsString}, 
{@link Completion}, 
{@link CompletionAsString}, 

* It provides of then following operations (getters and setters)
{@link getScheduleWork},
{@link getScheduleUsage},
{@link getScheduleUsageAsString},
{@link getScheduleStart},
{@link getScheduleFinish},
{@link getScheduleContour},
{@link getLevelingDelay},
{@link getIsOverAllocated},
{@link getStatusTime},
{@link getActualWork},
{@link getActualUsage},
{@link getActualUsageAsString},
{@link getActualStart},
{@link getActualFinish},
{@link getRemainingWork},
{@link getRemainingUsage},
{@link getRemainingUsageAsString},
{@link getCompletion},
{@link getCompletionAsString},
{@link setScheduleWork},
{@link setScheduleUsage},
{@link setScheduleUsageAsString},
{@link setScheduleStart},
{@link setScheduleFinish},
{@link setScheduleContour},
{@link setLevelingDelay},
{@link setIsOverAllocated},
{@link setStatusTime},
{@link setActualWork},
{@link setActualUsage},
{@link setActualUsageAsString},
{@link setActualStart},
{@link setActualFinish},
{@link setRemainingWork},
{@link setRemainingUsage},
{@link setRemainingUsageAsString},
{@link setCompletion},
{@link setCompletionAsString},
 */

@Description("")

public interface IfcResourceTime extends GenericEntity, ifc4.IfcSchedulingTime {

	EntityType<IfcResourceTime> T = EntityTypes.T(IfcResourceTime.class);

	/* Constants for each property name. */
	java.lang.String ScheduleWork = "ScheduleWork";
	java.lang.String ScheduleUsage = "ScheduleUsage";
	java.lang.String ScheduleUsageAsString = "ScheduleUsageAsString";
	java.lang.String ScheduleStart = "ScheduleStart";
	java.lang.String ScheduleFinish = "ScheduleFinish";
	java.lang.String ScheduleContour = "ScheduleContour";
	java.lang.String LevelingDelay = "LevelingDelay";
	java.lang.String IsOverAllocated = "IsOverAllocated";
	java.lang.String StatusTime = "StatusTime";
	java.lang.String ActualWork = "ActualWork";
	java.lang.String ActualUsage = "ActualUsage";
	java.lang.String ActualUsageAsString = "ActualUsageAsString";
	java.lang.String ActualStart = "ActualStart";
	java.lang.String ActualFinish = "ActualFinish";
	java.lang.String RemainingWork = "RemainingWork";
	java.lang.String RemainingUsage = "RemainingUsage";
	java.lang.String RemainingUsageAsString = "RemainingUsageAsString";
	java.lang.String Completion = "Completion";
	java.lang.String CompletionAsString = "CompletionAsString";

	@Description("")
	@Mandatory
	java.lang.String getScheduleWork();
	void setScheduleWork(java.lang.String ScheduleWork);
	@Description("")
	@Mandatory
	java.lang.Double getScheduleUsage();
	void setScheduleUsage(java.lang.Double ScheduleUsage);
	@Description("")
	@Mandatory
	java.lang.String getScheduleUsageAsString();
	void setScheduleUsageAsString(java.lang.String ScheduleUsageAsString);
	@Description("")
	@Mandatory
	java.lang.String getScheduleStart();
	void setScheduleStart(java.lang.String ScheduleStart);
	@Description("")
	@Mandatory
	java.lang.String getScheduleFinish();
	void setScheduleFinish(java.lang.String ScheduleFinish);
	@Description("")
	@Mandatory
	java.lang.String getScheduleContour();
	void setScheduleContour(java.lang.String ScheduleContour);
	@Description("")
	@Mandatory
	java.lang.String getLevelingDelay();
	void setLevelingDelay(java.lang.String LevelingDelay);
	@Description("")
	@Mandatory
	ifc4.Tristate getIsOverAllocated();
	void setIsOverAllocated(ifc4.Tristate IsOverAllocated);
	@Description("")
	@Mandatory
	java.lang.String getStatusTime();
	void setStatusTime(java.lang.String StatusTime);
	@Description("")
	@Mandatory
	java.lang.String getActualWork();
	void setActualWork(java.lang.String ActualWork);
	@Description("")
	@Mandatory
	java.lang.Double getActualUsage();
	void setActualUsage(java.lang.Double ActualUsage);
	@Description("")
	@Mandatory
	java.lang.String getActualUsageAsString();
	void setActualUsageAsString(java.lang.String ActualUsageAsString);
	@Description("")
	@Mandatory
	java.lang.String getActualStart();
	void setActualStart(java.lang.String ActualStart);
	@Description("")
	@Mandatory
	java.lang.String getActualFinish();
	void setActualFinish(java.lang.String ActualFinish);
	@Description("")
	@Mandatory
	java.lang.String getRemainingWork();
	void setRemainingWork(java.lang.String RemainingWork);
	@Description("")
	@Mandatory
	java.lang.Double getRemainingUsage();
	void setRemainingUsage(java.lang.Double RemainingUsage);
	@Description("")
	@Mandatory
	java.lang.String getRemainingUsageAsString();
	void setRemainingUsageAsString(java.lang.String RemainingUsageAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCompletion();
	void setCompletion(java.lang.Double Completion);
	@Description("")
	@Mandatory
	java.lang.String getCompletionAsString();
	void setCompletionAsString(java.lang.String CompletionAsString);
}
