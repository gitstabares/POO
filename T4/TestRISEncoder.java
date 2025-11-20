import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRISEncoder {
    public static void main(String[] args) {
        List<Reference> references = createTestData();
        RISEncoder<Reference> risEncoder = new RISEncoder<>();
        String risContent = risEncoder.encode(references);
        FileUtils.saveToFile("References.ris", risContent);
    }
    private static List<Reference> createTestData() {
        List<Reference> references = new ArrayList<>(Arrays.asList(
            new Reference("Deep Learning", Arrays.asList("GoodFellow, Ian", "Bengio, Yoshua", "Courville, Aaron"), "MIT Press", 2016),
            new Reference("Reinforcement Learning: An Introduction", Arrays.asList("Sutton, Richard", "Barto, Andrew"), "MIT Press", 2018),
            new Reference("EfficientNet: Rethinking Model Scaling for Convolutional Neural Networks", Arrays.asList("Tan, Mingxing", "Le, Quoc V."), "International Conference on Machine Learning", 2019),
            new Reference("ImageNet Classification with Deep Convolutional Neural Networks", Arrays.asList("Krizhevsky, Alex", "Sutskever, Ilya", "Hinton, Geoffrey E."), "NIPS", 2012),
            new Reference("Attention Is All You Need", Arrays.asList("Vaswani, Ashish", "Shazeer, Noam", "Parmar, Niki", "Uszkoreit, Jakob", "Jones, Llion", "Gomez, Aidan N.", "Kaiser, Łukasz", "Polosukhin, Illia"), "NIPS", 2017),
            new Reference("Deep Residual Learning for Image Recognition", Arrays.asList("He, Kaiming", "Zhang, Xiangyu", "Ren, Shaoqing", "Sun, Jian"), "CPVR", 2016),
            new Reference("Long Short-Term Memory", Arrays.asList("Hochreiter, Sepp", "Schmidhuber, Jürgen"), "Neural Computation", 1997),
            new Reference("Efficient Estimation of Word Representations in Vector Space", Arrays.asList("Mikolov, Tomas", "Chen, Kai", "Corrado, Greg", "Dean, Jeffrey"), "arXiv", 2013),
            new Reference("Intelligence Without Representation", Arrays.asList("Brooks, Rodney A."), "Artificial Intelligence Journal", 1991),
            new Reference("Reinforcement Learning for RoboCup Soccer Keepaway", Arrays.asList("Stone, Peter", "Kuhlmann, Greg", "Taylor, Matthew E.", "Kovarsky, Alexey", "Liu, Yngvi", "Riedmiller, Martin"), "Adaptive Behavior", 2005)));
        return references;
    }
}