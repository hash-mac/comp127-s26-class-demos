package _0408_api;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.images.ImageGenerateParams;
import com.openai.models.images.ImageModel;

// source: https://github.com/openai/openai-java/blob/main/openai-java-example/src/main/java/com/openai/example/ImageGenerationExample.java
public final class OpenAiImage {
    private OpenAiImage() {}

    public static void main(String[] args) throws IOException {
        String filePath = "../../hashcx/api-keys/openai.key";
        String apiKey = Files.readString(Path.of(filePath)).trim();
        
        OpenAIClient client = OpenAIOkHttpClient.builder()
            .apiKey(apiKey)
            .build();

        ImageGenerateParams imageGenerateParams = ImageGenerateParams.builder()
                .responseFormat(ImageGenerateParams.ResponseFormat.URL)
                .prompt("Two cats playing ping-pong")
                .model(ImageModel.DALL_E_2)
                .size(ImageGenerateParams.Size._512X512)
                .n(1)
                .build();

        client.images().generate(imageGenerateParams).data().orElseThrow().stream()
                .flatMap(image -> image.url().stream())
                .forEach(System.out::println);
    }
}
