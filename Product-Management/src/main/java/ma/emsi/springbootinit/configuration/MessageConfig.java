package ma.emsi.springbootinit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {
    //mentionner lendroit de fichier langue
   @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("lang/message");
        //pour accepter les caractere speciaux
        source.setDefaultEncoding("UTF-8");
        //pour accepter les caractere par defaut
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }
}
