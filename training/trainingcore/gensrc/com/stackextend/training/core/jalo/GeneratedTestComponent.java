/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 20, 2019 3:06:49 PM                     ---
 * ----------------------------------------------------------------
 */
package com.stackextend.training.core.jalo;

import com.stackextend.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.stackextend.training.core.jalo.TestComponent TestComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTestComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>TestComponent.compText</code> attribute **/
	public static final String COMPTEXT = "compText";
	/** Qualifier of the <code>TestComponent.buttonText</code> attribute **/
	public static final String BUTTONTEXT = "buttonText";
	/** Qualifier of the <code>TestComponent.url</code> attribute **/
	public static final String URL = "url";
	/** Qualifier of the <code>TestComponent.img</code> attribute **/
	public static final String IMG = "img";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPTEXT, AttributeMode.INITIAL);
		tmp.put(BUTTONTEXT, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		tmp.put(IMG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.buttonText</code> attribute.
	 * @return the buttonText - button text
	 */
	public String getButtonText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.getButtonText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, BUTTONTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.buttonText</code> attribute.
	 * @return the buttonText - button text
	 */
	public String getButtonText()
	{
		return getButtonText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.buttonText</code> attribute. 
	 * @return the localized buttonText - button text
	 */
	public Map<Language,String> getAllButtonText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,BUTTONTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.buttonText</code> attribute. 
	 * @return the localized buttonText - button text
	 */
	public Map<Language,String> getAllButtonText()
	{
		return getAllButtonText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.buttonText</code> attribute. 
	 * @param value the buttonText - button text
	 */
	public void setButtonText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.setButtonText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BUTTONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.buttonText</code> attribute. 
	 * @param value the buttonText - button text
	 */
	public void setButtonText(final String value)
	{
		setButtonText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.buttonText</code> attribute. 
	 * @param value the buttonText - button text
	 */
	public void setAllButtonText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,BUTTONTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.buttonText</code> attribute. 
	 * @param value the buttonText - button text
	 */
	public void setAllButtonText(final Map<Language,String> value)
	{
		setAllButtonText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.compText</code> attribute.
	 * @return the compText - comp Text
	 */
	public String getCompText(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.getCompText requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, COMPTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.compText</code> attribute.
	 * @return the compText - comp Text
	 */
	public String getCompText()
	{
		return getCompText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.compText</code> attribute. 
	 * @return the localized compText - comp Text
	 */
	public Map<Language,String> getAllCompText(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,COMPTEXT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.compText</code> attribute. 
	 * @return the localized compText - comp Text
	 */
	public Map<Language,String> getAllCompText()
	{
		return getAllCompText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.compText</code> attribute. 
	 * @param value the compText - comp Text
	 */
	public void setCompText(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.setCompText requires a session language", 0 );
		}
		setLocalizedProperty(ctx, COMPTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.compText</code> attribute. 
	 * @param value the compText - comp Text
	 */
	public void setCompText(final String value)
	{
		setCompText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.compText</code> attribute. 
	 * @param value the compText - comp Text
	 */
	public void setAllCompText(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,COMPTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.compText</code> attribute. 
	 * @param value the compText - comp Text
	 */
	public void setAllCompText(final Map<Language,String> value)
	{
		setAllCompText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.img</code> attribute.
	 * @return the img - button text
	 */
	public Media getImg(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.getImg requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, IMG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.img</code> attribute.
	 * @return the img - button text
	 */
	public Media getImg()
	{
		return getImg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.img</code> attribute. 
	 * @return the localized img - button text
	 */
	public Map<Language,Media> getAllImg(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,IMG,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.img</code> attribute. 
	 * @return the localized img - button text
	 */
	public Map<Language,Media> getAllImg()
	{
		return getAllImg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.img</code> attribute. 
	 * @param value the img - button text
	 */
	public void setImg(final SessionContext ctx, final Media value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.setImg requires a session language", 0 );
		}
		setLocalizedProperty(ctx, IMG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.img</code> attribute. 
	 * @param value the img - button text
	 */
	public void setImg(final Media value)
	{
		setImg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.img</code> attribute. 
	 * @param value the img - button text
	 */
	public void setAllImg(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,IMG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.img</code> attribute. 
	 * @param value the img - button text
	 */
	public void setAllImg(final Map<Language,Media> value)
	{
		setAllImg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.url</code> attribute.
	 * @return the url - button url
	 */
	public String getUrl(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.getUrl requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.url</code> attribute.
	 * @return the url - button url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.url</code> attribute. 
	 * @return the localized url - button url
	 */
	public Map<Language,String> getAllUrl(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,URL,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestComponent.url</code> attribute. 
	 * @return the localized url - button url
	 */
	public Map<Language,String> getAllUrl()
	{
		return getAllUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.url</code> attribute. 
	 * @param value the url - button url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestComponent.setUrl requires a session language", 0 );
		}
		setLocalizedProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.url</code> attribute. 
	 * @param value the url - button url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.url</code> attribute. 
	 * @param value the url - button url
	 */
	public void setAllUrl(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestComponent.url</code> attribute. 
	 * @param value the url - button url
	 */
	public void setAllUrl(final Map<Language,String> value)
	{
		setAllUrl( getSession().getSessionContext(), value );
	}
	
}
